package src.com.feng.design.behaviorpattern.Mediator;

/**中介者模式
 * 降低对象或者说事物之间通讯的复杂性，降低耦合。
 * 比如说分布式系统中，不是需要实时反馈的操作，我们无需直接对接，
 * 只需将想做的事告诉中间件，中间件告诉另外一个系统。
 * 比如说，访问（用户点击）一条新闻操作，同时需要记录是谁访问了什么新闻，
 * 同时给新闻浏览次数加1，还要实时更新用户喜好...总之要更新n个数据库表，
 * 甚至还要操作像ES,Mongo等多个中间件数据。但是对于用户来说，
 * 我只是做了一个点击操作，希望得到的结果就是看条新闻啊，你这么多操作，
 * 搞这么慢，用户体验很差啊，而且并发量也很低，那不如做成两个小系统，
 * A系统，拉取新闻，推送，并组装一个信息扔给MQ中间件，ok，结束，用户看到新闻。
 * 然后B系统监听，得到这个消息，进行各种更新，这里，这个中间件就是我们的中介。
 * 再比如说，MVC中的控制层就是展示层和模型层的中介
 *
 * 示例：简化版的数据同步方案，有三种数据库 Mysql、Redis、Elasticsearch，
 * 其中的 Mysql 作为主数据库，当增加一条数据时需要同步到另外两个数据库中；
 * Redis 作为缓存数据库，当增加一条数据时不需要同步到另外另个数据库；
 * 而 Elasticsearch 作为大数据查询数据库，有一个统计功能，
 * 当增加一条数据时只需要同步到 Mysql。
 * 使用中介者模式来设计，将数据同步的功能迁移到中介者中，由中介者来管理数据同步作业
 */
public abstract  class AbstractMediator {
    protected MysqlDatabase mysqlDatabase;
    protected RedisDatabase redisDatabase;
    protected EsDatabase esDatabase;

    public abstract void sync(String databaseName, String data);


    public MysqlDatabase getMysqlDatabase() {
        return mysqlDatabase;
    }

    public void setMysqlDatabase(MysqlDatabase mysqlDatabase) {
        this.mysqlDatabase = mysqlDatabase;
    }

    public RedisDatabase getRedisDatabase() {
        return redisDatabase;
    }

    public void setRedisDatabase(RedisDatabase redisDatabase) {
        this.redisDatabase = redisDatabase;
    }

    public EsDatabase getEsDatabase() {
        return esDatabase;
    }

    public void setEsDatabase(EsDatabase esDatabase) {
        this.esDatabase = esDatabase;
    }



}
