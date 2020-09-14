public class BowlingGame {
    int score=0;
    int turns=1;

    public int caculateScore(int[] knockdownPoints) {
        for(int i=0;i<knockdownPoints.length;){
            if(knockdownPoints[i]==10){
                addScoreWhenFirstKnockdownPointIs10(knockdownPoints,i);
                if(turns<10){
                    i++;
                    turns++;
                    continue;
                }else{
                    break;
                }
            }
            if(knockdownPoints[i]<10){
                addScoreWhenFirstKnockdownPointIsNot10(knockdownPoints,i);
                if(turns<10){
                    turns++;
                    i=i+2;
                    continue;
                }else{
                    break;
                }
            }
        }
        return score;
    }
    public void addScoreWhenFirstKnockdownPointIs10(int[]knockdownPoints,int index){
        score+=knockdownPoints[index];
        score+=knockdownPoints[index+1];
        score+=knockdownPoints[index+2];
    }

    public void addScoreWhenFirstKnockdownPointIsNot10(int[]knockdownPoints,int index){
        int curKnockdownPoints=knockdownPoints[index];
        score+=curKnockdownPoints;
        index++;
        int nextKnockdownPoints=knockdownPoints[index];
        score+=nextKnockdownPoints;
        if(curKnockdownPoints+nextKnockdownPoints==10){
            score+=knockdownPoints[index+1];
        }
    }

}
