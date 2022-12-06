package bowling.utils;

import bowling.domain.PinCount;

/**
 * Created by seungwoo.song on 2022-12-01
 */
public class StringUtils {

    private StringUtils() {
    }

    public static String getDesc(PinCount pinCount) {
        if (pinCount.isZero()) {
            return "-";
        }

        if (pinCount.isTen()) {
            return "X";
        }

        return pinCount.getValue() + "";
    }

    public static String getSecondDesc(PinCount first, PinCount second) {
        if (first.isTen()) {
            return getDesc(second);
        }

        if (first.sum(second).isTen()) {
            return "/";
        }

        return getDesc(second);
    }
}
