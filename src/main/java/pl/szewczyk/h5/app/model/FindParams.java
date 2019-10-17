package pl.szewczyk.h5.app.model;

public class FindParams {

    private int page;
    private int limit;

    public FindParams() {
    }

    public FindParams(int page, int limit) {
        this.page = page;
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "FindParams{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
