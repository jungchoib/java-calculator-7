# java-calculator-precourse

기능구현사항
1. "덧셈할 문자열을 입력해 주세요." 메세지와 함께 문자열 입력창 출력

2. 추가 구분자 인식
    문자열 맨 앞에 //""\n 포멧 확인
    1-1 ""이 공백      ->  구분자 , ;
    1-2 ""에 1문자     ->  구분자 , ; ""
    1-3 ""에 2문자 이상  ->  IllegalArgumentException
2-2. 추가 구분자 형식 잘못된 경우 IllegalArgumentException발생
    
3. 구분자로 숫자 분리
    문자를 구분자로 split
    3-1 구분자 + 숫자 외의 문자가 들어온경우 IllegalArgumentException
    3-2 구분자 사이에 숫자가 없는 경우 IllegalArgumentException

4. split된 숫자들의 합을 "결과 : " 형식으로 출력