package mjk.hellospring.model;

public class SimpleSearchCommand {

	private String searchText;

	public SimpleSearchCommand(){
		this.searchText = "SimpleSearchCommand constructed.";
	}
	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
}
