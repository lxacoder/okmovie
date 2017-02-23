package lxacoder.okmovie.model.rank.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lxacoder on 2016/10/3.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankDetailListBean {

    /**
     * id : 1435
     * name : 30岁的时候应该看的55部电影
     * summary : 30岁的时候一定要看的55部电影
     */

    @SerializedName("topList")
    public TopListEntity topList;
    /**
     * topList : {"id":1435,"name":"30岁的时候应该看的55部电影","summary":"30岁的时候一定要看的55部电影"}
     * movies : [{"id":11072,"name":"卡萨布兰卡","nameEn":"Casablanca","rankNum":1,"posterUrl":"http://img31.mtime.cn/mt/2013/12/26/103652.90504519_1280X720X2.jpg","decade":1942,"rating":8.6,"releaseDate":"1942年11月26日","releaseLocation":"美国","movieType":"战争/爱情/剧情","director":"迈克尔·柯蒂斯","actor":"亨弗莱·鲍嘉","actor2":"英格丽·褒曼","remark":"在混合着危险的异国情调的浪漫中，男女主角在乱世重逢，亨佛莱·鲍嘉硬汉式的沧桑，和英格丽·褒曼沉默中的娇柔，各自都有着身不由己的无奈和矛盾\u2026"},{"id":14884,"name":"热情似火","nameEn":"Some Like It Hot","rankNum":2,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/233820.36257951_1280X720X2.jpg","decade":1959,"rating":8.5,"releaseDate":"1959年3月29日","releaseLocation":"美国","movieType":"爱情/惊悚/犯罪","director":"比利·怀尔德","actor":"玛丽莲·梦露","actor2":"托尼·柯蒂斯","remark":"影史上最精彩的喜剧之一，选角天衣无缝，编导演炉火纯青。片中梦露有三首歌，但全片不太像歌舞片。全片台词妙语连珠。"},{"id":10996,"name":"筋疲力尽","nameEn":"A Bout de Souffle","rankNum":3,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/224938.93621796_1280X720X2.jpg","decade":1960,"rating":8.3,"releaseDate":"1960年3月16日","releaseLocation":"法国","movieType":"爱情/剧情/犯罪","director":"让-吕克·戈达尔","actor":"让-保罗·贝尔蒙多","actor2":"珍·茜宝","remark":"60年代法国新浪潮电影开山之作，从40年代美国黑帮片中吸取灵感，为电影制作开启了更自由、更个人化的空间，同时捧红了法国一代巨星贝尔蒙多。"},{"id":13877,"name":"惊魂记","nameEn":"Psycho","rankNum":4,"posterUrl":"http://img31.mtime.cn/mt/2012/10/10/100916.37827530_1280X720X2.jpg","decade":1960,"rating":8.6,"releaseDate":"1960年8月10日","releaseLocation":"美国","movieType":"恐怖/悬疑/惊悚","director":"阿尔弗雷德·希区柯克","actor":"安东尼·博金斯","actor2":"珍妮特·利","remark":"这部拍摄于1960年的黑白片可谓恐怖惊悚片的经典代表之作，同时也是希区柯克首次探索精神分裂杀人狂的划时代视听艺术作品。"},{"id":10483,"name":"蒂凡尼的早餐","nameEn":"Breakfast at Tiffany's","rankNum":5,"posterUrl":"http://img21.mtime.cn/mt/2011/09/27/204119.69077070_1280X720X2.jpg","decade":1961,"rating":8.3,"releaseDate":"1961年10月5日","releaseLocation":"美国","movieType":"喜剧/剧情/爱情","director":"布莱克·爱德华兹","actor":"奥黛丽·赫本","actor2":"乔治·佩帕德","remark":"这是一部著名的美国电影，被影评界誉为上世纪\u201c60年代美国最佳喜剧片\u201d，四十年来魅力丝毫不减，至今仍然吸引众多的观众。"},{"id":13910,"name":"毕业生","nameEn":"The Graduate","rankNum":6,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/232616.68150146_1280X720X2.jpg","decade":1967,"rating":8.2,"releaseDate":"1967年12月21日","releaseLocation":"美国","movieType":"爱情/剧情/喜剧","director":"迈克·尼科尔斯","actor":"安妮·班克罗夫特","actor2":"达斯汀·霍夫曼","remark":"体现青年人的成长及对成年人社会的奋起反抗，影片以一鸣惊人的姿势出现，成为\u201c新好莱坞电影\u201d里一部举足轻重的代表作。"},{"id":13441,"name":"午夜牛郎","nameEn":"Midnight Cowboy","rankNum":7,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/232051.33169991_1280X720X2.jpg","decade":1969,"rating":8.3,"releaseDate":"1969年5月25日","releaseLocation":"美国","movieType":"剧情","director":"约翰·施莱辛格","actor":"达斯汀·霍夫曼","actor2":"强·沃特","remark":"《午夜牛郎》是\u201c新好莱坞电影\u201d的一部代表作品。本片第一次在美国影坛上直言不讳地表现了同性恋问题。上映时引起了轩然大波。"},{"id":10550,"name":"发条橙","nameEn":"A Clockwork Orange","rankNum":8,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/224434.91952314_1280X720X2.jpg","decade":1971,"rating":8.4,"releaseDate":"1971年12月19日","releaseLocation":"美国","movieType":"惊悚/剧情/科幻","director":"斯坦利·库布里克","actor":"马尔科姆·麦克道威尔","actor2":"迈克尔·贝茨","remark":"《发条橘子》将矛头毫不留情地直指社会意识形态，将自由意志与社会意识形态表现得十分极端。影像十分华丽，仿佛一场感官盛宴。"},{"id":10968,"name":"教父","nameEn":"The Godfather","rankNum":9,"posterUrl":"http://img31.mtime.cn/mt/2013/12/23/133539.17727433_1280X720X2.jpg","decade":1972,"rating":9.1,"releaseDate":"1972年3月24日","releaseLocation":"美国","movieType":"剧情/惊悚/犯罪","director":"弗朗西斯·福特·科波拉","actor":"马龙·白兰度","actor2":"阿尔·帕西诺","remark":"1945年夏天，美国本部黑手党科莱昂家族首领，\u201c教父\u201d维托·唐·科莱昂为小女儿康妮举行了盛大的婚礼。\u201c教父\u201d有三个儿子：好色的长子逊尼，懦弱的次子弗雷德和刚从二战战场回来的小儿子迈克。其中逊尼是\u201c教父\u201d的得力助手；而迈克虽然精明能干，却对家族的\u201c事业\u201d没什么兴趣。 \u201c教父\u201d是黑手党首领，常干违法的构当。但同时他也是许多弱小平民的保护神，深得人们爱戴。他还有一个准则就是决不贩毒害人。为此他拒绝了毒枭素洛佐的要求，并因此激化了与纽约其它几个黑手党家族的矛盾。圣诞前夕，素洛佐劫持了\u201c教父\u201d的大女婿汤姆，并派人暗杀\u201c教父\u201d。\u201c教父\u201d中枪入院。素洛佐要汤姆设法使逊尼同意毒品买卖，重新谈判。逊尼有勇无谋，他发誓报仇，却无计可施。 迈克去医院探望父亲，他发现保镖已被收买，而警方亦和素洛佐串通一气。各家族间的火并一触即发。迈克制定了一个计策诱使素洛佐和警长前来谈判。在一家小餐馆内，迈克用事先藏在厕所内的手枪击毙了素洛佐和警长。 迈克逃到了西西里，在那里他娶了美丽的阿波萝妮亚为妻，过着田园诗般的生活。而此时，纽约各个黑手党家族间的仇杀却越来越激烈。逊尼也被康妮的丈夫卡洛出卖，被人打得千疮百孔。\u201c教父\u201d伤愈复出，安排各家族间的和解。听到噩耗的迈克也受到了袭击。被收买的保镖法布里奇奥在迈克的车上装了炸弹。迈克虽幸免于难，却痛失爱妻。 迈克于1951年回到了纽约，并和前女友凯结了婚。日益衰老的\u201c教父\u201d将家族首领的位置传给了迈克。在\u201c教父\u201d病故之后，迈克开始了酝酿已久的复仇。他派人刺杀了另两个敌对家族的首领，并亲自杀死了谋害他前妻的法布里奇奥。同时他也命人杀死了卡洛，为逊尼报了仇。 仇敌尽数剪除。康妮因为丈夫被杀而冲进了家门，疯狂地撕打迈克。迈克冷峻地命人把康妮送进了疯人院。他已经成了新一代的\u201c教父\u201d\u2014\u2014唐·科莱昂。"},{"id":13890,"name":"唐人街","nameEn":"Chinatown","rankNum":10,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/232603.38019698_1280X720X2.jpg","decade":1974,"rating":8.4,"releaseDate":"1974年6月20日","releaseLocation":"美国","movieType":"剧情/悬疑/惊悚","director":"罗曼·波兰斯基","actor":"杰克·尼科尔森","actor2":"费·唐纳薇","remark":"美国70年代黑色电影经典作品，罗曼·波兰斯基的阴冷风格贯彻全片，影片没有陈词滥调的套话，而是致力于严酷的出人意料的结局。 "},{"id":11253,"name":"洛基恐怖秀","nameEn":"The Rocky Horror Picture Show","rankNum":11,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/225249.19628436_1280X720X2.jpg","decade":1975,"rating":7.6,"releaseDate":"1975年9月26日","releaseLocation":"美国","movieType":"喜剧/歌舞","director":"吉姆·沙曼","actor":"蒂姆·克里","actor2":"苏珊·萨兰登","remark":"描写布拉德和珍纳在暴风雨中汽车失事，他们进入奥亥俄州的一幢古堡中求救。古堡主人佛特博士创造的科学怪人洛基正在完成阶段，他俩各自追求闯进来的年轻情侣，展开一连串不可思议的性爱历险。却原来古堡是外星人的太空船，他们正在进行变性的实验！"},{"id":14057,"name":"蒙迪佩登与圣杯","nameEn":"Monty Python and the Holy Grail","rankNum":12,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/232812.81848621_1280X720X2.jpg","decade":1975,"rating":7.8,"releaseDate":"1975年4月3日","releaseLocation":"英国","movieType":"冒险/喜剧","director":"特瑞·吉列姆","actor":"约翰·克立斯","actor2":"艾瑞克·爱都","remark":"影片以调侃的方式讲述了阿瑟王和圆桌武士们在寻找圣杯的过程中，经历的种种趣事。"},{"id":10364,"name":"出租车司机","nameEn":"Taxi Driver","rankNum":13,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/224222.52138134_1280X720X2.jpg","decade":1976,"rating":8.5,"releaseDate":"1976年2月8日","releaseLocation":"美国","movieType":"惊悚/剧情/犯罪","director":"马丁·斯科塞斯","actor":"罗伯特·德尼罗","actor2":"斯碧尔·谢波德","remark":"《出租汽车司机》是斯科西斯最具里程碑意义的一部作品，影片所蕴涵的现实意义和深刻思想足以被列为世界百年电影中的极品。"},{"id":10141,"name":"安妮·霍尔","nameEn":"Annie Hall","rankNum":14,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/223918.75051512_1280X720X2.jpg","decade":1977,"rating":8.2,"releaseDate":"1977年4月20日","releaseLocation":"美国","movieType":"爱情/喜剧","director":"伍迪·艾伦","actor":"伍迪·艾伦","actor2":"黛安·基顿","remark":"一个犹太青年艾尔维&#183;辛格独自住在纽约。其貌不扬，个儿又矮又小，戴着一副深度近视镜，衣服邋遢，不修边幅。但他口才颇佳，经常演单口相声。跟女人从来没有什麽风流事，倒过着悠然自得的独身生活。 某天，他的朋友、电视导演罗勃约他一起去打网球，凑巧在那里邂逅了一位名叫安妮&#183;霍尔的姑娘。她衣着时髦，口齿伶俐，交谈中她说自己很想当歌星。艾尔维顿时被她的魅力所倾倒，竟然爱上了她。没多久，这对男女就想在一起生活。安妮拿着自己的行李来到艾尔维的寓所，两人开始同居，起初生活倒也很快乐，无悠无虑。可是没多久，两人之间产生了裂痕，艾尔维求助精神分析法，也无济于事。这时安妮已在夜总会唱歌赚钱。 有一次她把一首流行歌曲唱的十分动人，竟博得了在场的著名歌星托尼&#183;莱西的掌声。托尼是个色狼，他垂涎于安妮的姿色与才华，花言巧语问安妮愿不愿意到加里福尼亚州去唱歌。艾尔维在一旁看到这情景，就更觉孤单了。此后，安妮和托尼还有罗勃之间的关系变得越来越暧昧，艾尔维疑窦丛生。安妮将自己的东西收拾好，很快的就去了加州。虽然他又见了安妮，但是两人之间的友情之火却也成了往事。"},{"id":18423,"name":"动物屋","nameEn":"Animal House","rankNum":15,"posterUrl":"http://img31.mtime.cn/mt/2014/02/23/002902.52372160_1280X720X2.jpg","decade":1978,"rating":7,"releaseDate":"1978年7月27日","releaseLocation":"美国","movieType":"喜剧/爱情","director":"约翰·兰迪斯","actor":"约翰·贝鲁西","actor2":"提姆·麦锡森","remark":"本片是《国家讽刺文社》首次进军影坛的作品，作为全美大学生最钟爱的刊物，影片立即风靡全美校园，成为大受欢迎的喜剧片经典。 "},{"id":12218,"name":"现代启示录","nameEn":"Apocalypse Now","rankNum":16,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/230441.87325020_1280X720X2.jpg","decade":1979,"rating":8.5,"releaseDate":"1979年8月15日","releaseLocation":"美国","movieType":"动作/剧情/冒险","director":"弗朗西斯·福特·科波拉","actor":"马丁·辛","actor2":"马龙·白兰度","remark":"越战期间，美军威尔德上尉奉命除掉叛逃的库尔兹上校。在寻找过程中，威尔德一行人卷入到一个超乎现实、彻底疯狂的世界。"},{"id":12047,"name":"外星人E.T.","nameEn":"E.T.: The Extra-Terrestrial","rankNum":17,"posterUrl":"http://img21.mtime.cn/mt/2010/12/24/212001.19488310_1280X720X2.jpg","decade":1982,"rating":8.4,"releaseDate":"1982年6月11日","releaseLocation":"美国","movieType":"冒险/家庭/奇幻","director":"史蒂文·斯皮尔伯格","actor":"亨利·托马斯","actor2":"德鲁·巴里摩尔","remark":"影片描述一位十岁男孩与一个外星造访者，划破时空隔阂，建立了纯真的友谊，是一部是罕见的富有人情味的科学幻想片。"},{"id":18410,"name":"摇滚万岁","nameEn":"This Is Spinal Tap","rankNum":18,"posterUrl":"http://img31.mtime.cn/mt/2014/02/23/002855.95313980_1280X720X2.jpg","decade":1984,"rating":7.7,"releaseDate":"1984年3月2日","releaseLocation":"美国","movieType":"喜剧/音乐","director":"罗伯·莱纳","actor":"罗伯·莱纳","actor2":"克里斯多弗·盖斯特","remark":"本片刻意杜撰出一个英国摇滚乐团Spinal Tap，将一个虚构的乐团台上台下表里不一的嘴脸，以仿纪录片的形式呈现在观众面前，对当代摇滚乐做出尖锐嘲讽。一个虚构的乐团台上台下表里不一的嘴脸，以仿纪录片的形式呈现在观众面前。"},{"id":10882,"name":"回到未来","nameEn":"Back to the Future","rankNum":19,"posterUrl":"http://img31.mtime.cn/mt/2014/02/22/224816.12640983_1280X720X2.jpg","decade":1985,"rating":8.3,"releaseDate":"1985年7月3日","releaseLocation":"美国","movieType":"冒险/喜剧/科幻","director":"罗伯特·泽米吉斯","actor":"迈克尔·J·福克斯","actor2":"克里斯托弗·洛伊德","remark":"在布朗博士被恐怖分子杀害后，高中生马丁则驾着时间机器从1985年回到了1955年，并遇到了自己的父亲。马丁能否改变未来？"},{"id":17797,"name":"早餐俱乐部","nameEn":"The Breakfast Club","rankNum":20,"posterUrl":"http://img31.mtime.cn/mt/2014/02/23/002105.17136730_1280X720X2.jpg","decade":1985,"rating":8,"releaseDate":"1985年2月15日","releaseLocation":"美国","movieType":"剧情","director":"约翰·休斯","actor":"艾米利奥·艾斯特维兹","actor2":"安东尼·迈克尔·豪尔","remark":"描写五位个性反叛的男女同学，在假期被罚留校温习功课。五人的家庭背景和性格各异，但在他们诚恳交谈之后，逐渐放开了彼此的戒心和敌意，变成了心意相通的好友。"}]
     * totalCount : 55
     * pageCount : 3
     * nextTopList : {"toplistId":1427,"toplistItemType":0,"toplistType":0}
     * previousTopList : {"toplistId":1446,"toplistItemType":0,"toplistType":0}
     */

    @SerializedName("totalCount")
    public int totalCount;
    @SerializedName("pageCount")
    public int pageCount;
    /**
     * toplistId : 1427
     * toplistItemType : 0
     * toplistType : 0
     */

    @SerializedName("nextTopList")
    public NextTopListEntity nextTopList;
    /**
     * toplistId : 1446
     * toplistItemType : 0
     * toplistType : 0
     */

    @SerializedName("previousTopList")
    public PreviousTopListEntity previousTopList;
    /**
     * id : 11072
     * name : 卡萨布兰卡
     * nameEn : Casablanca
     * rankNum : 1
     * posterUrl : http://img31.mtime.cn/mt/2013/12/26/103652.90504519_1280X720X2.jpg
     * decade : 1942
     * rating : 8.6
     * releaseDate : 1942年11月26日
     * releaseLocation : 美国
     * movieType : 战争/爱情/剧情
     * director : 迈克尔·柯蒂斯
     * actor : 亨弗莱·鲍嘉
     * actor2 : 英格丽·褒曼
     * remark : 在混合着危险的异国情调的浪漫中，男女主角在乱世重逢，亨佛莱·鲍嘉硬汉式的沧桑，和英格丽·褒曼沉默中的娇柔，各自都有着身不由己的无奈和矛盾…
     */

    @SerializedName("movies")
    public List<MoviesEntity> movies;

    public static class TopListEntity {
        @SerializedName("id")
        public int id;
        @SerializedName("name")
        public String name;
        @SerializedName("summary")
        public String summary;
    }

    public static class NextTopListEntity {
        @SerializedName("toplistId")
        public int toplistId;
        @SerializedName("toplistItemType")
        public int toplistItemType;
        @SerializedName("toplistType")
        public int toplistType;
    }

    public static class PreviousTopListEntity {
        @SerializedName("toplistId")
        public int toplistId;
        @SerializedName("toplistItemType")
        public int toplistItemType;
        @SerializedName("toplistType")
        public int toplistType;
    }

    public static class MoviesEntity {
        @SerializedName("id")
        public int id;
        @SerializedName("name")
        public String name;
        @SerializedName("nameEn")
        public String nameEn;
        @SerializedName("rankNum")
        public int rankNum;
        @SerializedName("posterUrl")
        public String posterUrl;
        @SerializedName("decade")
        public int decade;
        @SerializedName("rating")
        public double rating;
        @SerializedName("releaseDate")
        public String releaseDate;
        @SerializedName("releaseLocation")
        public String releaseLocation;
        @SerializedName("movieType")
        public String movieType;
        @SerializedName("director")
        public String director;
        @SerializedName("actor")
        public String actor;
        @SerializedName("actor2")
        public String actor2;
        @SerializedName("remark")
        public String remark;
    }
}
