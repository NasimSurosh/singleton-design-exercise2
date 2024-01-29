package exam;

public class CalculateEverageOfStudents {

	public static void main(String[] args) {

		int[] studentScore = { 67, 85, 92, 56, 66, 75, 100, 93 };
		double calculate = calculateScore(studentScore);
		int highscore = highstScore(studentScore);
		int above = overEvg(studentScore, calculate);
		double percent = percentage(above, studentScore.length);

		System.out.println(calculate);
		System.out.println(highscore);
		System.out.println(above);
		System.out.println(percent);

	}

	public static double calculateScore(int[] scores) {

		int total = 0;
		for (int score : scores) {
			total = total + score;
		}
		return (double) total / scores.length;
	}

	public static int highstScore(int[] scores) {
		int highScore = 0;
		for (int score : scores) {
			if (score > highScore) {
				highScore = score;
			}
		}
		return highScore;
	}

	public static int overEvg(int[] scores, double evg) {
		int count = 0;
		for (int score : scores) {
			if (score > evg) {
				count++;
			}
		}
		return count;
	}

	public static double percentage(int everageobove, int totalStudent) {
		return ((double) everageobove / totalStudent) * 100;
	}

}
