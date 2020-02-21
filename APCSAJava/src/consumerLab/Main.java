package consumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("APCSAJava/src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println("The file contains the text " + temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}

		System.out.println("        The Total sentiment is\n         " + Review.totalSentiment("APCSAJava/src/ConsumerLab/positiveAdjectives.txt") + "\n\n");
		System.out.println("              The Rating is\n               " + Review.starRating("APCSAJava/src/ConsumerLab/positiveAdjectives.txt") + "\n\n");
		System.out.println("             Fake Review:\n             " + Review.fakeWord("APCSAJava/src/ConsumerLab/simpleReview.txt") + "\n\n");
		System.out.println("             Negative Review:\n             " + Review.moreNegativeReview("APCSAJava/src/ConsumerLab/simpleReview.txt") + "\n\n");
		System.out.println("             Positive Review:\n             " + Review.morePositiveReview("APCSAJava/src/ConsumerLab/simpleReview.txt") + "\n\n");
		
	}
	/*==========================Output in Console from running Main=====================
	 * The file contains the text great
The file contains the text happy
The file contains the text awesome
The file contains the text perfect
The file contains the text wonderful
great
happy
awesome
perfect
wonderful
word great has sentiment value 1.48
word happy has sentiment value 0.0
word awesome has sentiment value 0.92
word perfect has sentiment value 0.0
word wonderful has sentiment value 2.76
        The Total sentiment is
         5.16
word great has sentiment value 1.48
word happy has sentiment value 0.0
word awesome has sentiment value 0.92
word perfect has sentiment value 0.0
word wonderful has sentiment value 2.76
              The Rating is
               4
             Fake Review:
             Phillip is an awesome friend. It's so disappointed that he is always watching PH in class though. I think his friend Cody is really great though. 
             Negative Review:
             Phillip is an awful friend. It's so weird that he is always watching PH in class though. I think his friend Cody is really terrible though. 
             Positive Review:
             Phillip is an amazing friend. It's so wonderful that he is always watching PH in class though. I think his friend Cody is really wonderful though. 
	 */
}