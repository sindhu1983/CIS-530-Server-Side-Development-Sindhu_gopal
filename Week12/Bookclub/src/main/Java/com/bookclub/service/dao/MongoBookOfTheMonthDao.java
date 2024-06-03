public class MongoBookOfTheMonthDao {

    @Repository(“bookOfTheMonthDao”);

    @Override
    Public List<BookOfTheMonth> list(String key) {
        Int month = Integer.parseInt(key);

        System.out.println("Month:"+month);

        if (month==999) {
            return mongoTemplate.findAll(BookOfTheMonth.class);
        }

        Query query = new Query();

        query.addCriteria(Criteria.where("month").is(month));

        return mongoTemplate.find(query, BookOfTheMonth.class);
    }
    
}
