public class Ex3_3 {

    /**
     * 타입의 먹이사슬 (boolean은 형변환 제외니 예외)
     * byte -> (short, char) -> int -> long -> float -> double
     * 정수 < 실수 이며, byte 크기 순으로 크다.
     */

    public static void main(String[] args){
        // 상위 타입에서 하위 타입으로 변환 - 국룰 1
        int i = 300;
        byte b = (byte) i;
        System.out.println(b);
        // 하위 타입에서 상위 타입으로 변환 (생략 가능) - 국룰 2
        int k = 1;
        long l = 1000L + k;
        System.out.println(l);

        // 정수형, 실수형 사이 변환 - 1
        int c = 2;
        double d = 14.0 + c;
        System.out.println(d);

        // 정수형, 실수형 사이 변환 - 2
        double z = 1.0;
        int s = 3 + (int) z;
        System.out.println(s);

        // 실수형 사이 변환
        double u = 14.0;
        float f = 3.2f + (float)u;
        System.out.println(f);
    }
}
