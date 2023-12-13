게시판 만들기 (Spring boot + JPA)
=

>작업기간: 2023.11.22 ~ 2023.12.03 (12일) <br>

## ※ 개발환경
- IDE: IntelliJ IDEA Community
- Spring Boot 2.7.6
- JDK 11
- MySQL 8.0.35
- Spring Data JPA
- Thymeleaf

<br>

## 1. 구현기능

- **게시판 기능**
    - 게시글 작성 
    - 게시글 검색
    - 게시글 수정 
    - 게시글 삭제
    - 파일 등록 및 다운로드 

- **댓글 기능**
    - 댓글 작성 
    - 댓글 수정 
    - 댓글 삭제

<br>

## 2. 구조 및 설계
### 📦DB 설계

---
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/7689295c-7feb-4098-83e9-119cbc685692)


<br><br>

### 🛰️API 설계

---
## BoardController
| 이름              |요청방식 | URL    |
|-------------------|--------|--------|
| 게시물 등록  | POST  | /Board/save |
| 게시글 전체 조회  | GET  | /Board/paging|
| 게시물 상세 | GET  | /Board/{id} |
| 게시물 수정   | POST | /Board/update |
| 게시물 삭제 | POST | /Board/delete/{id} |

## CommentController
| 이름              |요청방식 | URL    |
|-------------------|--------|--------|
| 댓글 등록  | POST  | /Comment/save |
| 댓글 목록  | GET  | /Comment/list/{boardId} |
| 댓글 수정   | POST | /Comment/{commentId} |
| 댓글 삭제 | POST | /Comment/delete/{commentId} |

<br>

## 3. 실행 화면
### 게시글 
1. 게시글 작성 <br>
  \- 텍스트와 파일 첨부
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/717fb1e1-7bb2-4dde-986b-ca56cae40774)


3. 게시글 목록 <br>
  \- 업로드된 게시글들을 확인할 수 있음
  \- 한 페이지에 게시글5개, 최대 3페이지
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/2f68c355-924e-493e-8a5e-047296b47027)


4. 게시글 조회 <br>
  \- 작성된 게시글의 제목,내용,파일,댓글 확인이 가능
  \- 첨부된 파일은 다운로드 가능
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/667ba80f-f363-44ea-ad08-7f0c63414924)


5. 게시글 수정 <br>
  \- 상세화면에서 수정 버튼 클릭 <br>
  \- 새로운 작성 칸이 나오고 입력한 내용으로 수정
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/e07b032b-3bf5-4d5f-9c44-a5576f06e967)


6. 게시글 삭제 <br>
  \- 상세화면에서 삭제 버튼 클릭
![image](https://github.com/sejinpark2/Board/assets/141610055/14317a6b-75c1-4fa2-ae34-1b59cdc2cd9b)


7. 첨부 파일 다운로드 <br>
  \- 상세화면에서 첨부 파일 옆 다운로드 버튼 클릭
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/355a18e6-cd15-4d3f-8088-0be53f8af93a)


<br>

### 댓글
1. 댓글 작성
![image](https://github.com/sejinpark2/Board/assets/141610055/fcbf9214-2adf-42bb-b7aa-e4b86eb27405)


2. 댓글 수정 <br>
  \- 댓글 옆 수정 버튼 클릭 
![image](https://github.com/sejinpark2/Board/assets/141610055/830608f6-dd5b-4a9c-b5c2-04021d1f747d)
![image](https://github.com/sejinpark2/Board/assets/141610055/6b34f70f-fa3c-4df3-bb9b-b78446d19a35)


4. 댓글 삭제 <br>
  \- 댓글 옆 삭제 버튼 클릭
![image](https://github.com/sejinpark2/Board/assets/141610055/4d1bc7ff-b567-4c0e-b43e-8322bd2e4ab0)
![image](https://github.com/sejinpark2/Board/assets/141610055/47fb2df8-74f2-4f24-90eb-4e14bd313e50)

<br>

## 4. 향후 업데이트 예정 기능
#### - 유저 연동하여 회원만이 게시글,댓글 추가,삭제 가능하게 하기
#### - 게시글 목록에 좋아요나 조회수 기능 추가하기
#### - 게시글 수정할 때 기존의 글과 파일 그대로 불러오기


<br> 
 

## 5. 회고📝
### 후기 및 아쉬운 점

- 프론트 관련 지식이 아예 없다보니 html에서 프론트 작업을 한다고 시간이 꽤 많이 소요되어 아쉬웠습니다. <br>
   그래서 백엔드 관련 코드를 깊게 볼 시간이 부족했던 점이 아쉬웠고 따로 코드 리뷰 하면서 학습해야겠다고 생각을 했습니다. <br>
   백엔드 개발자가 되더라도 프론트 관련 지식도 필요한 것 같아 프론트 관련 기초 지식 정도는 공부해야 할 것 같습니다.

- 지금은 CRUD 기능만 구현했지만 나중에는 로그인 연동이나 게시판 조회수, 좋아요 등 다른 추가 기능도 공부해서 추가해보겠습니다.

- 개인적으로 작업을 하다 보니 깃허브 활용이나 주기적인 업데이트 중요성을 몰랐습니다.
   다음부턴 깃허브를 활용하여 이슈 관리나 버전 업데이트도 해보려고 합니다.
   

  



