class Main{
    public static void main(String[] args){

        Recommendation recommendation = new RecencyBasedRecommendation();

        RecommendationEngine recommendationengine=new RecommendationEngine(recommendation);
        recommendationengine.execute();
    }
}