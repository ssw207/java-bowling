package bowling.domain.frame;

import bowling.domain.PinCount;
import bowling.domain.Result;
import bowling.domain.Score;
import bowling.domain.state.State;
import bowling.exception.CannotCalculateException;

import java.util.Optional;

public abstract class Frame {
    public static final int IN_VALID_SCORE = -1;
    protected final int no;
    protected State state;
    protected Frame next;
    protected Optional<Score> score = Optional.empty();

    protected Frame(int no, State state) {
        this.no = no;
        this.state = state;
    }

    public int getNo() {
        return no;
    }

    public Frame bowl(int count) {
        return bowl(PinCount.of(count));
    }

    protected State getState() {
        return state;
    }

    protected Frame getNext() {
        return next;
    }

    public boolean isFinish() {
        return state.isFinish();
    }

    public Result createResult() {
        try {
            return new Result(getScore().getValue(), state.getDesc());
        } catch (CannotCalculateException e) {
            return new Result(IN_VALID_SCORE, state.getDesc());
        }
    }

    public abstract Score getScore();

    protected abstract Score calculateBonusScore(Score score);

    public abstract Frame bowl(PinCount pinCount);

    @Override
    public String toString() {
        return "Frame{" +
                "no=" + no +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
