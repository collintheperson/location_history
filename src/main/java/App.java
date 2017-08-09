
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Location;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String cdSuitcases = request.queryParams("suitcases");
            String cdToilet = request.queryParams("toiletries");
            boolean cdMap = Boolean.parseBoolean(request.queryParams("map"));  //If this dosen't work this is definately the line to look at
            Location location = new Location(cdSuitcases, cdToilet, cdMap);
            model.put("post", location);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
