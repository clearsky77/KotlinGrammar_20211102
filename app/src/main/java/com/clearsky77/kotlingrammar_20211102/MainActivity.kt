package com.clearsky77.kotlingrammar_20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {
//            기본적인 변수 만들고 / 대입하고 / 활용 (로그찍기)
//            1. 변수 공간만 만들기
            val myName: String
            var myHeight: Double

//            2. 변수에 데이터 대입.
            myName = "Nyaru"
            myHeight = 165.5

//            3. 데이터 활용
            Log.d("이름", myName)
            Log.d("키", myHeight.toString())  // Log의 재료는 String만 대입 가능. => 변수를 쓸때 자료형을 신경쓰자.

//            참고 - 모든 변수는 참조형 변수. 부가 기능 있음. => 공통 기능 : String으로 변환 가능. => toString()

        }


        btnVariable02.setOnClickListener {
//            변수를 만들고 -> 바로 데이터 대입.
            val myBirthYear = 1977 // 대입한 값의 형태? 정수 (Int) => myBirthYear도 Int 형태로 결정됨.
            Log.d("출생년도", myBirthYear.toString())
//            2021년의 나이는 몇살?
            val myKoreanAge = 2021 - myBirthYear + 1  // 변수를 대입할때, 기능 실행(계산식)의 결과를 바로 대입 가능.
            Log.d("나이", myKoreanAge.toString())

        }


        btnCondition01.setOnClickListener {

            val myAge = 7

            if ( myAge >= 20 ) {

//                 질문내용이 맞으면 실행될 코드.
                Log.d("나이검사", "성인이다냥.")

            }
            else if ( myAge >= 17 ) {
                Log.d("나이검사", "고등학생이군냥.")
            }
            else if ( myAge >= 14 ) {
                Log.d("나이검사", "중학생이래냥.")
            }
            else {
                Log.d("나이검사", "초등학생냥.")
            }

        }


        btnCondition02.setOnClickListener {

            val aCompanySalary = 5800
            val aCompanyMinute = 20
            val aCompanyFinishEalry = true

//            1번 지원자는 A회사에 취업할까?
//             연봉만 5천이상이면 OK
            if ( aCompanySalary >= 5000 ) {
                Log.d("1번 지원자", "입사한다냥 ~ㅂ~")
            } else {
                Log.d("1번 지원자", "입사 거부다냥! ='ㅈ'=")
            }

            // 2번 지원자 출퇴근이 10분 이내
            if (aCompanyMinute <= 10) {
                Log.d("2번 지원자", "입사한다냥 ~ㅂ~")
            } else {
                Log.d("2번 지원자", "입사 거부다냥 ='ㅈ'=")
            }

            // 3번 지원자 칼퇴
            if (aCompanyFinishEalry) {
                Log.d("3번 지원자", "입사한다냥 ~ㅂ~")
            } else {
                Log.d("3번 지원자", "입사 거부다냥 ='ㅈ'=")
            }

            // 4번 지원자 연봉 4천 이상 and 거리 10분 이내
            if (aCompanySalary >= 4000 && aCompanyMinute <= 10) {
                Log.d("4번 지원자", "입사한다냥 ~ㅂ~")
            } else {
                Log.d("4번 지원자", "입사 거부다냥 ='ㅈ'=")
            }

            // 5번 지원자 거리 20분 이내 or 칼퇴
            if (aCompanyMinute <= 20 || aCompanyFinishEalry) {
                Log.d("5번 지원자", "입사한다냥 ~ㅂ~")
            } else {
                Log.d("5번 지원자", "입사 거부다냥 ='ㅈ'=")
            }

        }



    }
}