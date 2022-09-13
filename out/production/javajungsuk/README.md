# javajungsuk
https://long-garment-01a.notion.site/1074ddc7892d455588d140806f92a173
   
   
SimpleDateFormat의 parse
---
https://github.com/hyunha95/javajungsuk/blob/13fe053c652899e0dccd9d758e1b5ce147566451/second/ch10/DateFormatEx3.java#L13   
SimpleDateFormat의 parse (String source)는 문자열source을 날짜Date 인스턴스로 변환해주기 때문에 매우 유용하기 쓰일 수 있다.   
예를 들어 사용자로부터 날짜 데이터를 문자열로 입력받을 때, 입력받은 문자열을 날짜로 인식하기 위해서는 substring메서드를 이용해서 년, 월, 일을 뽑아내야 하는데 parse(String source)은 이러한 수고를 덜어 준다.
