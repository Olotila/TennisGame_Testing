import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

//Here is the format of the scores: "player1Score - player2Score"
//"love - love" done

	@Ignore




public class TennisGameTestTest {

		//"15 - 15"

	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_15_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "15 - 15", score);		
	}
	
	//"30 - 30"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_30_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "30 - 30", score);		
	}
	
	//"love - 15"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_love15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
//		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "love - 15", score);		
	}
	
	//"15 - love"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_15love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
//		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "15 - love", score);		
	}

	//"30 - love"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_30love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
//		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "30 - love", score);		
	}
	
	// "love - 30"

	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_love30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
//		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "love - 30", score);		
	}
	//"40 - love"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_40love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
//		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "40 - love", score);		
	}
	// "love - 40"

	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_love40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
//		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "love - 40", score);		
	}

	//"30 - 15"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_3015() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "30 - 15", score);		
	}
	
	// "15 - 30"
	
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_1530() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "15 - 30", score);		
	}

	//"40 - 15"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_4015() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "40 - 15", score);		
	}

	//"player1 has advantage"
	
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_1adv() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "player1 has advantage", score);		
	}
	
	//"player2 has advantage"
	
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_2adv() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "player2 has advantage", score);		
	}

	//"player1 wins"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_1wins() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
//		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();
		game.player1Scored();
//		game.player2Scored();
//		game.player1Scored();
//		game.player2Scored();
		game.player1Scored();
		game.player1Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "player1 wins", score);		
	}

	//"player2 wins"
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_2win() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
//		game.player2Scored();


		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "player2 wins", score);		
	}
}
