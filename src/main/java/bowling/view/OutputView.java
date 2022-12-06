package bowling.view;

public class OutputView {

//    private static final String MARK = "|";
//    private static final int FINAL_ROUND = 10;
//    private static final String EMPTY_MARK = "   ";
//
//    private final String header = getHeader();
//
//    public static OutputView init() {
//        return new OutputView();
//    }
//
//    private String getHeader() {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(MARK);
//        sb.append(String.format(" NAME "));
//
//        for (int i = 1; i <= 10; i++) {
//            sb.append(MARK);
//            sb.append(String.format("  %s   ", lpadZero(i)));
//        }
//        sb.append(MARK);
//        return sb.toString();
//    }
//
//    public void print(Name name, Bowling frames) {
//        System.out.println(header);
//        System.out.println(getBody(name, frames));
//        System.out.println(getScore(frames));
//    }
//
//    private String getBody(Name name, Bowling frames) {
//        return getMarkdedString(name.toString(), i -> getFrameResult(frames, i));
//    }
//
//    private String getScore(Bowling frames) {
//        return getMarkdedString(EMPTY_MARK, i -> getFrameScore(frames, i));
//    }
//
//    private String getFrameScore(Bowling frames, Integer index) {
//        if (isMaxOver(frames, index) || frames.isEmpty(index) || frames.getScore(index).isEmpty()) {
//            return EMPTY_MARK;
//        }
//
//        return frames.getScore(index)
//                .orElseThrow(() -> new IllegalArgumentException("점수를 조회할 수 없습니다"))
//                .toString();
//    }
//
//    private String getMarkdedString(String name, Function<Integer, String> function) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(MARK);
//        sb.append(String.format("  %s ", name));
//
//        for (int i = 0; i < 10; i++) {
//            sb.append(MARK);
//            sb.append(formatScore(function.apply(i)));
//        }
//        sb.append(MARK);
//        return sb.toString();
//    }
//
//    private static String lpadZero(int round) {
//        if (round == FINAL_ROUND) {
//            return round + "";
//        }
//
//        return "0" + round;
//    }
//
//    private String getFrameResult(Bowling frames, int index) {
//        if (isMaxOver(frames, index) || frames.isEmpty(index)) {
//            return EMPTY_MARK;
//        }
//
//        return getNormalFrameScore(frames.get(index));
//    }
//
//    private boolean isMaxOver(Bowling frames, int index) {
//        return index > frames.size() - 1;
//    }
//
//    private String formatScore(String scoreMark) {
//        return "  " + rpad(scoreMark);
//    }
//
//    private String rpad(String scoreMark) {
//        StringBuilder sb = new StringBuilder();
//
//        int cnt = 5 - scoreMark.length();
//        for (int i = 0; i < cnt; i++) {
//            sb.append(" ");
//        }
//        return scoreMark + sb;
//    }
//
//    private String getNormalFrameScore(Frame frame) {
//        List<String> list = new ArrayList<>();
//        for (RollingResult rollingResult : frame) {
//            list.add(getScoreMark(rollingResult));
//        }
//
//        return String.join(MARK, list);
//    }
//
//    private String getScoreMark(RollingResult rollingResult) {
//        Result result = rollingResult.getResult();
//        int count = rollingResult.getCount();
//
//        if (Result.STRIKE == result) {
//            return "X";
//        }
//
//        if (Result.SPARE == result) {
//            return "/";
//        }
//
//        if (Result.GUTTER == result) {
//            return "-";
//        }
//
//        return count + "";
//    }
}
