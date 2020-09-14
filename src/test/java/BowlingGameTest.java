import exception.WrongKnockPointException;
import exception.WrongPointsArraySizeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    @Test
    void should_return_score_correctly_when_right_knockdown_points_is_given_and_the_10th_turn_point_is_10() {
        BowlingGame bowlingGame = new BowlingGame();
        int knockdownPoints[] = {10, 1, 2, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int score = bowlingGame.caculateScore(knockdownPoints);
        Assertions.assertEquals(256, score);
    }

    @Test
    void should_return_score_correctly_when_right_knockdown_points_is_given_and_the_10th_turn_point_is_not_10() {
        BowlingGame bowlingGame = new BowlingGame();
        int knockdownPoints[] = {10, 1, 2, 10, 10, 10, 10, 10, 10, 10, 2, 3};
        int score = bowlingGame.caculateScore(knockdownPoints);
        Assertions.assertEquals(208, score);
    }

    @Test
    void should_throw_WrongKnockPointException_when_false_knockdown_points_is_given() {
        BowlingGame bowlingGame = new BowlingGame();
        int knockdownPoints[] = {10, 1, 11, 10, 10, 10, 10, 10, 10, 10, 2, 3};
        Assertions.assertThrows(WrongKnockPointException.class, () -> {
            bowlingGame.caculateScore(knockdownPoints);
        });
    }

    @Test
    void should_throw_WrongPointsArraySizeException_when_false_points_array_size_is_given() {
        BowlingGame bowlingGame = new BowlingGame();
        int knockdownPoints[] = {10, 1, 1, 10, 10, 10, 10, 10, 10, 10, 2, 3, 1};
        Assertions.assertThrows(WrongPointsArraySizeException.class, () -> {
            bowlingGame.caculateScore(knockdownPoints);
        });
    }

}
