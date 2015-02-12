package controller;

import model.Blog;

import com.jfinal.core.Controller;

public class BlogController extends Controller {
    public void index()
    {
        setAttr("blogPage", Blog.me.paginate(getParaToInt(0, 1), 10));
        render("blog.html");
    }
}
