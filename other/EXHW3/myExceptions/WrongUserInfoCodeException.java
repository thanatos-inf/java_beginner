package other.EXHW3.myExceptions;

public class WrongUserInfoCodeException {

    public int countEnough(String[] userInfo) {
        if (userInfo.length < 6) {
            return -1;
        }
        return 0;
    }
}
