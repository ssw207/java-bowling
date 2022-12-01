package bowling.domain.state.last;

import bowling.domain.PinCount;
import bowling.domain.state.State;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by seungwoo.song on 2022-11-30
 */
class LastFrameFirstBowlTest {

    @Test
    void 스트라이크() {
        State state = new LastFrameFirstBowl(10);
        assertThat(state.next(PinCount.of(10))).isInstanceOf(LastFrameSecondBowl.class);
    }

    @Test
    void 스페어() {
        State state = new LastFrameFirstBowl(5);
        assertThat(state.next(PinCount.of(5))).isInstanceOf(LastFrameSecondBowl.class);
    }
    
    @Test
    void 미스() {
        State state = new LastFrameFirstBowl(2);
        assertThat(state.next(PinCount.of(5))).isInstanceOf(LastFrameLastBowl.class);
    }
}