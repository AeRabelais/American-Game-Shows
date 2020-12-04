package com.jeopardy.game;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * @author Ashia Lewis
 *
 */
final class QuestionSet {
	
	private Question[] set;
	private static final int NUMBER_OF_QUESTIONS = 30;
	
	public QuestionSet() throws IOException {
		
		set = new Question[NUMBER_OF_QUESTIONS];
		
		Scanner qDoc = new Scanner(Path.of("writeMyRights.txt")); // put the text file with all questions in here
		
		Category c;
		String q, a;
		for(Question que: set) {
			c = Category.valueOf(qDoc.nextLine());
			q = qDoc.nextLine();
			a = qDoc.nextLine();
			que = new Question(c, q, a);
			
		}
		
		}
		
	
	

}
