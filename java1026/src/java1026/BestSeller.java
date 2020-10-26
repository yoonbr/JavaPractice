package java1026;

public class BestSeller {
	
	// 데이터 생성과 관련된 부분 
	private int rank;
	private String bookname; 
	private String writer;
	private String date;
	private int price;
	private double score;
	
	// name을 bookname 으로 바꿀 때 바꿔야 할 다른게 있는지? 
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getWriter() {
		return writer;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "BestSeller [rank=" + rank + ", bookname=" + bookname + ", writer=" + writer + ", date=" + date
				+ ", price=" + price + ", score=" + score + "]";
	}
	
	
}
