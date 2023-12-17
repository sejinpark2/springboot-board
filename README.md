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
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/90729154-f5ea-4ae0-b38d-2a936abfe922)


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
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/0cee88f3-535b-45cb-832b-9130d4d4a331)


7. 첨부 파일 다운로드 <br>
  \- 상세화면에서 첨부 파일 옆 다운로드 버튼 클릭
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/355a18e6-cd15-4d3f-8088-0be53f8af93a)


<br>

### 댓글
1. 댓글 작성
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/eb1125aa-3eda-4d79-b888-ddfb48d02c8d)



2. 댓글 수정 <br>
  \- 댓글 옆 수정 버튼 클릭 
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/5d038c07-04ab-475a-be6e-47ccaba11a1e)
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/84088be5-1d5b-46ac-b509-89a618d2bff9)


4. 댓글 삭제 <br>
  \- 댓글 옆 삭제 버튼 클릭
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/6cbfedeb-4851-4386-b8b3-8fe31c69190c)
![image](https://github.com/sejinpark2/springboot-board/assets/141610055/33ffc1c9-51d2-4782-95d9-2189711edcc5)


<br>

## 4. 버전 업데이트

#### v1.5.0
1. html 오류 수정
2. [추가] 댓글 수정,삭제

#### v1.4.0 
1. [추가] 게시글에 첨부한 파일(이미지) 다운로드

#### v1.3.0 
1. [추가] 게시글 작성 <br>
  \- 파일(이미지) 첨부

#### v1.2.0
1. [추가] 댓글 작성
2. [추가] 게시글에 달린 댓글 리스트

#### v1.1.0 
1. [추가] 게시글 조회 <br>
2. [추가] 게시글 수정
3. [추가] 게시글 삭제
4. [추가] 작성,페이징,디테일 html 

#### v1.0.0 
1. [추가] 게시글 작성 <br>
  \- 제목, 내용
2. [추가] 메인 페이지 이동(/)


<br>

## 5. 향후 업데이트 예정 기능
#### - 유저 연동하여 회원만이 게시글,댓글 추가,삭제 가능하게 하기(작업 중)
#### - 게시글 목록에 좋아요나 조회수 기능 추가하기
#### - 게시글 수정할 때 기존의 글과 파일 그대로 불러오기


<br> 

 
## 6. 회고📝
### 후기 및 아쉬운 점

- 프론트 관련 지식이 아예 없다보니 html에서 프론트 작업을 한다고 시간이 꽤 많이 소요되어 아쉬웠습니다. <br>
   백엔드 관련 코드를 깊게 볼 시간이 부족했던 점이 아쉬웠고 따로 코드 리뷰를 많이 해야겠다고 생각했습니다. <br>
   백엔드 개발자가 되더라도 프론트 관련 지식은 필요한 것 같아 프론트 관련 기초 지식 정도는 찾아보겠습니다.

- 지금은 CRUD 기능만 구현되어 있지만 로그인 연동이나 게시판 조회수, 좋아요 등 다른 추가 기능도 공부해서 추가해보겠습니다.

- 개인적으로만 작업을 하다 보니 깃허브 활용이나 주기적인 업데이트 중요성을 몰랐는데
   다음부턴 깃허브를 활용하여 이슈 관리나 버전 업데이트도 잘 해보겠습니다.
   

  



