interface Recommendation{
    void Recommend();
}

class RecencyBasedRecommendation implements Recommendation{
    @Override 
    public void Recommend(){
        System.out.println("Recently you watches similar contents.");
    }
}

class GenreBasedRecommendation implements Recommendation{
    @Override 
    public void Recommend(){
        System.out.println("Recently you watches contents of similar genre.");
    }
}

class HistoryBasedRecommendation implements Recommendation{
    @Override 
    public void Recommend(){
        System.out.println("People generally watch these after the one you are currently watching.");
    }
}

class RecommendationEngine{
    private Recommendation recommendation;
    RecommendationEngine(Recommendation recommendation){
        this.recommendation=recommendation;
    }
    void execute(){
        recommendation.Recommend();
    }
}