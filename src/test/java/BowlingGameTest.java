import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    @Test
    void should_return_score_correctly_when_right_knockdown_points_is_given_and_and_the_10th_turn_point_is_10()  {
        BowlingGame bowlingGame=new BowlingGame();
        int knockdownPoints[]={ 10,1,2,10,10,10,10,10,10,10,10,10,10};
        int score=bowlingGame.caculateScore(knockdownPoints);
        Assertions.assertEquals(256,score);
    }

    @Test
    void should_return_score_correctly_when_right_knockdown_points_is_given_and_and_the_10th_turn_point_is_not_10(){
        BowlingGame bowlingGame=new BowlingGame();
        int knockdownPoints[]={ 10,1,2,10,10,10,10,10,10,10,2,3};
        int score=bowlingGame.caculateScore(knockdownPoints);
        Assertions.assertEquals(208,score);
    }

}
