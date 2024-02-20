# 💻 SpringBoot3 / JPA / ThymeLeaf : Blog CRUD
<br>

* SpringBoot3 / JPA / ThymeLeaf : Blog CRUD 구현
* 개인 프로젝트


### INDEX

01. [프로젝트 소개](#-프로젝트-소개)
02. [개발 기간](#-개발-기간)
03. [개발 상세](#-개발-상세)
04. [구현 기능 소개](#-구현-기능-소개)
05. [개발 환경](#-개발-환경)
07. [회고](#-회고)   

<br>

## 🔎 프로젝트 소개
* 스프링부트3, Thymeleaf, JPA, H2 Console을 활용한 블로그 서비스 구축
* SpringBoot3, JPA, Thymeleaf를 기반으로 하여 Blog CRUD를 구현하였다.
* REST API로 주소와 메서드만 보고 요청의 내용을 파악하여 프로그램 간 상호작용하는 매개체로 작용한다.
* Spring Security로 로그인과 로그아웃을 구현하였다.

  
<br>

## 🔎 개발 기간
`2024.01.25. - 2024.02.20.`

<br>

## 🔎 개발 상세
### 스프링부트3를 기반으로 하여 Thymeleaf로 뷰 구성 
### JPA를 활용해 데이터베이스와의 연동을 구현한 블로그 서비스 개발 프로젝트
* 사용자가 블로그 글을 작성, 조회, 수정, 삭제할 수 있는 기본적인 CRUD 기능을 제공하는 블로그 서비스를 구축하는 것을 목표로 한다.
  
### DB : h2-console
* 메모리 기반의 H2 데이터베이스를 사용하여 실시간으로 데이터 관리
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/72c7e965-888a-4068-841e-410c244cbdb9)



<br>


## 🔎 구현 기능 소개
### 블로그 CRUD
#### 목록보기
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/cb2370a3-4d70-41df-91d5-7af65b4f3203)

<br>

#### 글 작성하기
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/78dc0e2a-e13c-4a8e-a8a2-fb7f3215ca73)
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/99c2911c-4280-4e75-8ba8-fd0447d8a412)

<br>

#### 수정하기
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/4aefcccd-0561-45c6-b8ea-29e88ab63e34)
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/d27a3ece-bde3-4526-9931-1fb9c50fde30)

<br>

#### 블로그 글 상세보기
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/4781bfaf-7c5a-44d3-934b-0145f4ec4e54)

<br><br>

### 스프링 시큐리티 기능
* 인증된 사용자만 들어갈 수 있는 페이지에서 /login으로 리다이렉트
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/566efe0d-dab3-4ae4-85b4-025867bede80) <br>

* 회원가입 폼
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/011c7547-f63f-4eb3-b3a8-75614c757026) <br>

* 암호화된 비밀번호 확인 <br>
![image](https://github.com/Eumnya415/springboot-developer/assets/145963611/95bb1200-8e4d-49a7-bb1e-e24678434fec)

<br>

## 🔎 개발 환경
### Tech Skills
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/> <img src="https://img.shields.io/badge/thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white"/> <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"/>
<br>

### Tools
<img src="https://img.shields.io/badge/IntelliJ-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/><br>

### And So On
<img src="https://img.shields.io/badge/junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white"/>
<br>

* 사용 언어 : Java
* 개발 환경 : IntelliJ IDEA ,H2 Console
* 라이브러리/프레임워크: SpringBoot3, Thymeleaf, JPA (Java Persistence API)

<br>


## 🔎 회고
> 이 프로젝트를 통해 웹 개발에 필요한 스프링부트의 기본적인 CRUD(Create, Read, Update, Delete) 기능을 구현하였고, 이 과정에서 여러가지 기술과 개념을 배웠다. 스프링부트3를 기반으로 Thymeleaf 템플릿 엔진과 JPA를 활용해 개발하면서, 데이터베이스는 메모리 기반의 H2를 사용해 프로젝트를 진행하였다.
 스프링부트3와 JPA를 처음 사용하면서 도메인 모델링과 데이터베이스 연동에 어려움을 겪었다. 공식 문서와 여러 블로그를 참고하여 문제를 해결하였다. 특히, JPA의 연관 관계 매핑에 대한 이해를 통해 데이터베이스와의 연동을 더 효율적으로 할 수 있었다.
이번 프로젝트를 통해 얻은 경험을 바탕으로, 보다 복잡한 기능을 가진 웹 애플리케이션을 개발해보고 싶다. 또한, 사용자 인터페이스를 개선하고, 성능 최적화 등에 대해 더 학습하고 싶다.
