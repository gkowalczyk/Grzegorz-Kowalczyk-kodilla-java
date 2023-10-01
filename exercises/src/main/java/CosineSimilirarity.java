import java.util.stream.IntStream;

public class CosineSimilirarity {

//https://subscription.packtpub.com/book/data/9781787285651/9/ch09lvl1sec73/cosine-similarity   theory cosine similarity

    //cosine similarity= /A⋅B / ∥A∥∥B∥

    public static double calculateCosineSimilarity(double[] vectorA, double[] vectorB) {

        double numerator = IntStream.range(0, vectorA.length)
                .mapToDouble(i -> vectorA[i] * vectorB[i])
                .sum();
        double denominatorA = Math.sqrt(IntStream.range(0, vectorA.length)
                .mapToDouble(i -> vectorA[i] * vectorA[i])
                .sum());
        double denominatorB = Math.sqrt(IntStream.range(0, vectorA.length)
                .mapToDouble(i -> vectorB[i] * vectorB[i])
                .sum());

        return numerator / (denominatorA * denominatorB);
    }

    public static void main(String[] args) {

        double[] vectorA = {1.0, 2.0, 3.0, 5.0};
        double[] vectorB = {0.0, 0.0, 5.0, 2.0};

        double cosineSimilarity = calculateCosineSimilarity(vectorA, vectorB);
        System.out.println("Cosine similarity =  " + cosineSimilarity);
    }
}
