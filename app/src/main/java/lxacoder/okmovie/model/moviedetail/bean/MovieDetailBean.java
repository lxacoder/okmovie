package lxacoder.okmovie.model.moviedetail.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lxacoder on 2016/9/15.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */
public class MovieDetailBean {

    /**
     * max : 10
     * average : 5.8
     * details : {"1":932,"3":229,"2":246,"5":641,"4":520}
     * stars : 30
     * min : 0
     */

    @SerializedName("rating")
    public RatingEntity rating;
    /**
     * rating : {"max":10,"average":5.8,"details":{"1":932,"3":229,"2":246,"5":641,"4":520},"stars":"30","min":0}
     * reviews_count : 214
     * videos : []
     * wish_count : 9447
     * original_title : 大话西游3
     * blooper_urls : ["http://vt1.doubanio.com/201609152333/c9fc6d47910a6085ebc998eaadc34c98/view/movie/M/302030349.mp4","http://vt1.doubanio.com/201609152333/648996dedd691dae303ba5f97c9ea65e/view/movie/M/302020448.mp4","http://vt1.doubanio.com/201609152333/3f91fbf2816eb0b7c055ec0b2df7fffc/view/movie/M/301990973.mp4","http://vt1.doubanio.com/201609152333/63a7c4dfae827695b8f3a591485182aa/view/movie/M/301830330.mp4"]
     * collect_count : 7335
     * images : {"small":"http://img3.douban.com/view/movie_poster_cover/ipst/public/p2377676571.jpg","large":"http://img3.douban.com/view/movie_poster_cover/lpst/public/p2377676571.jpg","medium":"http://img3.douban.com/view/movie_poster_cover/spst/public/p2377676571.jpg"}
     * douban_site :
     * year : 2016
     * popular_comments : [{"rating":{"max":5,"value":1,"min":0},"useful_count":1132,"author":{"uid":"122060054","avatar":"http://img3.douban.com/icon/u122060054-3.jpg","signature":"","alt":"http://www.douban.com/people/122060054/","id":"122060054","name":"土国全安"},"subject_id":"26284595","content":"心疼莫文蔚，何苦来趟这摊恶心的脏水。","created_at":"2016-09-12 21:15:53","id":"1083999998"},{"rating":{"max":5,"value":1,"min":0},"useful_count":835,"author":{"uid":"130146156","avatar":"http://img3.douban.com/icon/u130146156-2.jpg","signature":"","alt":"http://www.douban.com/people/130146156/","id":"130146156","name":"风拂晓城"},"subject_id":"26284595","content":"史上最丑紫霞VS史上最猥琐至尊宝，你选哪个？","created_at":"2016-09-12 19:14:25","id":"1083960435"},{"rating":{"max":5,"value":1,"min":0},"useful_count":1032,"author":{"uid":"90529771","avatar":"http://img3.douban.com/icon/u90529771-1.jpg","signature":"","alt":"http://www.douban.com/people/90529771/","id":"90529771","name":"丝米"},"subject_id":"26284595","content":"奇葩的阵容，一个是民大小偷，一个是中戏之耻，好好笑","created_at":"2016-09-12 22:46:35","id":"1084040775"},{"rating":{"max":5,"value":1,"min":0},"useful_count":322,"author":{"uid":"134968001","avatar":"http://img3.douban.com/icon/u134968001-2.jpg","signature":"","alt":"http://www.douban.com/people/134968001/","id":"134968001","name":"马薇薇"},"subject_id":"26284595","content":"原来的班底，却是这样的两个主演，失败，失望","created_at":"2016-09-13 20:45:43","id":"1084350798"}]
     * alt : https://movie.douban.com/subject/26284595/
     * id : 26284595
     * mobile_url : https://movie.douban.com/subject/26284595/mobile
     * photos_count : 222
     * pubdate : 2016-09-14
     * title : 大话西游3
     * do_count : null
     * has_video : false
     * share_url : http://m.douban.com/movie/subject/26284595
     * seasons_count : null
     * languages : ["汉语普通话"]
     * schedule_url : https://movie.douban.com/subject/26284595/cinema/
     * writers : [{"avatars":{"small":"http://img3.douban.com/img/celebrity/small/45374.jpg","large":"http://img3.douban.com/img/celebrity/large/45374.jpg","medium":"http://img3.douban.com/img/celebrity/medium/45374.jpg"},"name_en":"Jeffrey Lau","name":"刘镇伟","alt":"https://movie.douban.com/celebrity/1274431/","id":"1274431"}]
     * pubdates : ["2016-09-14(中国大陆)"]
     * website :
     * tags : ["大话西游","烂片","喜剧","烂","2016","爱情","搞笑","感动","炒冷饭","香港"]
     * has_schedule : true
     * durations : ["93分钟"]
     * genres : ["喜剧","爱情","奇幻"]
     * collection : null
     * trailers : [{"medium":"http://img3.douban.com/img/trailer/medium/2375419301.jpg?1471832904","title":"内地预告片：终极版 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/202227/","small":"http://img3.douban.com/img/trailer/small/2375419301.jpg?1471832904","resource_url":"http://vt1.doubanio.com/201609152333/a121f6e65b2eb721d8d72a134ff0f88c/view/movie/M/302020227.mp4","id":"202227"},{"medium":"http://img3.douban.com/img/trailer/medium/2380682195.jpg?1473847137","title":"预告片：多语言版 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/203697/","small":"http://img3.douban.com/img/trailer/small/2380682195.jpg?1473847137","resource_url":"http://vt1.doubanio.com/201609152333/83d22a976e39024a2379bd5f527258c1/view/movie/M/302030697.mp4","id":"203697"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2378517369.jpg?1473222176","title":"内地预告片：导演版 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/203162/","small":"http://img3.doubanio.com/img/trailer/small/2378517369.jpg?1473222176","resource_url":"http://vt1.doubanio.com/201609152333/abc9a54405ea93043e4b12e3696e28ad/view/movie/M/302030162.mp4","id":"203162"},{"medium":"http://img3.douban.com/img/trailer/medium/2352868951.jpg?1463460318","title":"内地预告片：爆笑版 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/196620/","small":"http://img3.douban.com/img/trailer/small/2352868951.jpg?1463460318","resource_url":"http://vt1.doubanio.com/201609152333/61db05876fe77dd7008ccf76fb2ea634/view/movie/M/301960620.mp4","id":"196620"}]
     * episodes_count : null
     * trailer_urls : ["http://vt1.doubanio.com/201609152333/a121f6e65b2eb721d8d72a134ff0f88c/view/movie/M/302020227.mp4","http://vt1.doubanio.com/201609152333/83d22a976e39024a2379bd5f527258c1/view/movie/M/302030697.mp4","http://vt1.doubanio.com/201609152333/abc9a54405ea93043e4b12e3696e28ad/view/movie/M/302030162.mp4","http://vt1.doubanio.com/201609152333/61db05876fe77dd7008ccf76fb2ea634/view/movie/M/301960620.mp4"]
     * has_ticket : true
     * bloopers : [{"medium":"http://img3.douban.com/img/trailer/medium/2378984821.jpg?1473399130","title":"花絮：刘镇伟特辑 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/203349/","small":"http://img3.douban.com/img/trailer/small/2378984821.jpg?1473399130","resource_url":"http://vt1.doubanio.com/201609152333/c9fc6d47910a6085ebc998eaadc34c98/view/movie/M/302030349.mp4","id":"203349"},{"medium":"http://img3.douban.com/img/trailer/medium/2376125415.jpg?1472103819","title":"花絮：吴京特辑 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/202448/","small":"http://img3.douban.com/img/trailer/small/2376125415.jpg?1472103819","resource_url":"http://vt1.doubanio.com/201609152333/648996dedd691dae303ba5f97c9ea65e/view/movie/M/302020448.mp4","id":"202448"},{"medium":"http://img3.douban.com/img/trailer/medium/2367548912.jpg?","title":"花絮：含糖特辑 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/199973/","small":"http://img3.douban.com/img/trailer/small/2367548912.jpg?","resource_url":"http://vt1.doubanio.com/201609152333/3f91fbf2816eb0b7c055ec0b2df7fffc/view/movie/M/301990973.mp4","id":"199973"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2266238556.jpg?","title":"花絮：探班现场 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/183330/","small":"http://img3.doubanio.com/img/trailer/small/2266238556.jpg?","resource_url":"http://vt1.doubanio.com/201609152333/63a7c4dfae827695b8f3a591485182aa/view/movie/M/301830330.mp4","id":"183330"}]
     * clip_urls : ["http://vt1.doubanio.com/201609152333/263e2bc696a704d5300009c87e42f5a4/view/movie/M/302020112.mp4"]
     * current_season : null
     * casts : [{"avatars":{"small":"http://img3.douban.com/img/celebrity/small/14025.jpg","large":"http://img3.douban.com/img/celebrity/large/14025.jpg","medium":"http://img3.douban.com/img/celebrity/medium/14025.jpg"},"name_en":"Geng Han","name":"韩庚","alt":"https://movie.douban.com/celebrity/1275667/","id":"1275667"},{"avatars":{"small":"http://img3.douban.com/img/celebrity/small/48044.jpg","large":"http://img3.douban.com/img/celebrity/large/48044.jpg","medium":"http://img3.douban.com/img/celebrity/medium/48044.jpg"},"name_en":"Yan Tang","name":"唐嫣","alt":"https://movie.douban.com/celebrity/1274479/","id":"1274479"},{"avatars":{"small":"http://img3.douban.com/img/celebrity/small/39105.jpg","large":"http://img3.douban.com/img/celebrity/large/39105.jpg","medium":"http://img3.douban.com/img/celebrity/medium/39105.jpg"},"name_en":"Jing Wu","name":"吴京","alt":"https://movie.douban.com/celebrity/1000525/","id":"1000525"},{"avatars":{"small":"http://img3.douban.com/img/celebrity/small/27003.jpg","large":"http://img3.douban.com/img/celebrity/large/27003.jpg","medium":"http://img3.douban.com/img/celebrity/medium/27003.jpg"},"name_en":"Karen Mok","name":"莫文蔚","alt":"https://movie.douban.com/celebrity/1018248/","id":"1018248"}]
     * countries : ["中国大陆","香港"]
     * mainland_pubdate : 2016-09-14
     * photos : [{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2352908890.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2352908890.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2352908890.jpg","alt":"https://movie.douban.com/photos/photo/2352908890/","id":"2352908890","icon":"http://img3.douban.com/view/photo/icon/public/p2352908890.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2380766892.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2380766892.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2380766892.jpg","alt":"https://movie.douban.com/photos/photo/2380766892/","id":"2380766892","icon":"http://img3.douban.com/view/photo/icon/public/p2380766892.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2378975470.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2378975470.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2378975470.jpg","alt":"https://movie.douban.com/photos/photo/2378975470/","id":"2378975470","icon":"http://img3.douban.com/view/photo/icon/public/p2378975470.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2378065625.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2378065625.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2378065625.jpg","alt":"https://movie.douban.com/photos/photo/2378065625/","id":"2378065625","icon":"http://img3.douban.com/view/photo/icon/public/p2378065625.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2325742181.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2325742181.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2325742181.jpg","alt":"https://movie.douban.com/photos/photo/2325742181/","id":"2325742181","icon":"http://img3.douban.com/view/photo/icon/public/p2325742181.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2380766932.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2380766932.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2380766932.jpg","alt":"https://movie.douban.com/photos/photo/2380766932/","id":"2380766932","icon":"http://img3.douban.com/view/photo/icon/public/p2380766932.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2380766913.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2380766913.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2380766913.jpg","alt":"https://movie.douban.com/photos/photo/2380766913/","id":"2380766913","icon":"http://img3.douban.com/view/photo/icon/public/p2380766913.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2380766904.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2380766904.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2380766904.jpg","alt":"https://movie.douban.com/photos/photo/2380766904/","id":"2380766904","icon":"http://img3.douban.com/view/photo/icon/public/p2380766904.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2380766901.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2380766901.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2380766901.jpg","alt":"https://movie.douban.com/photos/photo/2380766901/","id":"2380766901","icon":"http://img3.douban.com/view/photo/icon/public/p2380766901.jpg"},{"thumb":"http://img3.douban.com/view/photo/thumb/public/p2380766895.jpg","image":"http://img3.douban.com/view/photo/photo/public/p2380766895.jpg","cover":"http://img3.douban.com/view/photo/albumcover/public/p2380766895.jpg","alt":"https://movie.douban.com/photos/photo/2380766895/","id":"2380766895","icon":"http://img3.douban.com/view/photo/icon/public/p2380766895.jpg"}]
     * summary : 在《大话西游之大圣娶亲》中死在牛魔王叉下的紫霞仙子（唐嫣 饰），将会通过月光宝盒预先看到这一下场，为了避免惨剧发生，她选择回到从前不让至尊宝（韩庚 饰）爱上自己。而至尊宝又再次重逢一直在等待他的白晶晶（莫文蔚 饰）。前世今生的种种爱恨纠葛再次在九道轮回里最后一次上演。
     * clips : [{"medium":"http://img3.doubanio.com/img/trailer/medium/2374760868.jpg?1471584072","title":"片段 (中文字幕)","subject_id":"26284595","alt":"https://movie.douban.com/trailer/202112/","small":"http://img3.doubanio.com/img/trailer/small/2374760868.jpg?1471584072","resource_url":"http://vt1.doubanio.com/201609152333/263e2bc696a704d5300009c87e42f5a4/view/movie/M/302020112.mp4","id":"202112"}]
     * subtype : movie
     * directors : [{"avatars":{"small":"http://img3.douban.com/img/celebrity/small/45374.jpg","large":"http://img3.douban.com/img/celebrity/large/45374.jpg","medium":"http://img3.douban.com/img/celebrity/medium/45374.jpg"},"name_en":"Jeffrey Lau","name":"刘镇伟","alt":"https://movie.douban.com/celebrity/1274431/","id":"1274431"}]
     * comments_count : 5487
     * popular_reviews : [{"rating":{"max":5,"value":1,"min":0},"title":"悟空，快取了这紫霞的狗命！","subject_id":"26284595","author":{"uid":"xiaoyaozizai","avatar":"http://img3.douban.com/icon/u1892408-5.jpg","signature":"公众账号：jintiandao1984","alt":"http://www.douban.com/people/xiaoyaozizai/","id":"1892408","name":"今天道"},"summary":"  1.这个新编故事是这样的：原来故事里的至尊宝并不是孙悟空，真正的孙悟空是个叫秦祥林的六耳猕猴；原来紫霞不是为至尊宝死的，殉情的是青霞。青霞和秦祥林借春三十娘生了个儿子叫唐僧。为了赎罪，秦祥林从天而降打...","alt":"https://movie.douban.com/review/8085338/","id":"8085338"},{"rating":{"max":5,"value":1,"min":0},"title":"曾经沧海难为水，当经典已成为往事","subject_id":"26284595","author":{"uid":"138400246","avatar":"http://img3.douban.com/icon/u138400246-2.jpg","signature":"","alt":"http://www.douban.com/people/138400246/","id":"138400246","name":"繁花终落"},"summary":"曾经有一份真诚的爱情放在我面前，我没有珍惜，等我失去的时候我才后悔莫及，人世间最痛苦的事莫过于此。     如果上天能够给我一个再来一次的机会，我会对那个女孩子说三个字：我爱你。 如果非要在这份爱上加上一个...","alt":"https://movie.douban.com/review/8083524/","id":"8083524"},{"rating":{"max":5,"value":1,"min":0},"title":"问：要把大话变笑话总共分几步？","subject_id":"26284595","author":{"uid":"134862117","avatar":"http://img3.doubanio.com/icon/u134862117-7.jpg","signature":"","alt":"http://www.douban.com/people/134862117/","id":"134862117","name":"～^_^～"},"summary":"答：三步 第一步：将大话的经典剧情统统搬出来，还是要取经还是要结婚还是月光宝盒。 第二步：对演员的不挑剔，翻拍这样一部经典演员演技在线这是最起码的要求，然而现在所看的大话男主一个人将所有角色都能演成无所...","alt":"https://movie.douban.com/review/8083866/","id":"8083866"},{"rating":{"max":5,"value":1,"min":0},"title":"菩你老母，你能不能别毁了我们的大话西游","subject_id":"26284595","author":{"uid":"147845651","avatar":"http://img3.douban.com/icon/u147845651-2.jpg","signature":"","alt":"http://www.douban.com/people/147845651/","id":"147845651","name":"离别啊，你赢了"},"summary":"听说菩提老祖刘镇伟要拍大话西游3的时候，我就像是掉入万丈深渊的感觉。这又是一部毁经典的电影，先不说能不能拍好这部大话西游3，毁星爷的大话西游是肯定的了。大话西游的结局就是完美的了，夕阳武士和那个像极了紫...","alt":"https://movie.douban.com/review/8021919/","id":"8021919"},{"rating":{"max":5,"value":1,"min":0},"title":"演员表应该会是这部戏最大的笑点","subject_id":"26284595","author":{"uid":"115657337","avatar":"http://img3.doubanio.com/icon/u115657337-6.jpg","signature":"","alt":"http://www.douban.com/people/115657337/","id":"115657337","name":"肯尼迪里昂"},"summary":"---------------9.15--------------- 时光荏苒，20年的白云苍狗，一切都变了。当初年少轻狂，意气风发的至尊宝，如今变成了满头白发的星爷，爱到痴狂的紫霞仙子，也嫁作人妇。 紫霞是那种看到自己会死去的结局就决定...","alt":"https://movie.douban.com/review/7869400/","id":"7869400"},{"rating":{"max":5,"value":1,"min":0},"title":"导演的三大功绩","subject_id":"26284595","author":{"uid":"SELVEN","avatar":"http://img3.doubanio.com/icon/u1666383-348.jpg","signature":"补充光","alt":"http://www.douban.com/people/SELVEN/","id":"1666383","name":"SELVEN"},"summary":"导演刘镇伟于本片有三大功绩需要表彰，首先他终于攻克了一项中国影史上的宇宙级难题：唐嫣的演技问题。导演另辟蹊径大胆启用一群演的比唐还要烂的演员（莫文蔚不算，因为她是cg合成的，not real），用各种玲琅满目的...","alt":"https://movie.douban.com/review/8085386/","id":"8085386"},{"rating":{"max":5,"value":2,"min":0},"title":"狗尾续貂","subject_id":"26284595","author":{"uid":"123404248","avatar":"http://img3.douban.com/icon/u123404248-1.jpg","signature":"","alt":"http://www.douban.com/people/123404248/","id":"123404248","name":"龍"},"summary":"其实我一直认为，大话系列已经完结了，而且真正的大话西游只有一部，那就是《大话西游之仙履奇缘》。之所以这么说，完整的《大话西游》由《月光宝盒》和《仙履奇缘》两部构成，但《月光宝盒》怎么看都只是一部无厘头...","alt":"https://movie.douban.com/review/8084699/","id":"8084699"},{"rating":{"max":5,"value":3,"min":0},"title":"差的是演员，而不是剧本，为喷而喷，实在可笑","subject_id":"26284595","author":{"uid":"29170072","avatar":"http://img3.douban.com/icon/u29170072-1.jpg","signature":"","alt":"http://www.douban.com/people/29170072/","id":"29170072","name":"修万年"},"summary":"《大话西游3》如果要做个评价的话还真是难，说烂片吧也不算差，大厅的观众也是笑声不断，说好吧又好不到哪里去，问题的关键是，你让一群根本不适合拍喜剧的人去拍喜剧，能有什么效果？周星驰其实是个很严肃的一个人...","alt":"https://movie.douban.com/review/8085768/","id":"8085768"},{"rating":{"max":5,"value":1,"min":0},"title":"已成经典，就不要再碰了！","subject_id":"26284595","author":{"uid":"140350839","avatar":"http://img3.douban.com/icon/u140350839-2.jpg","signature":"","alt":"http://www.douban.com/people/140350839/","id":"140350839","name":"灵逸飘雪"},"summary":"        光看演员，已经扑街；再看预告，心碎成渣渣\u2026\u2026请问葡萄，把紫霞演成神经质，至尊宝演成对周星驰版的拙劣模仿，这是对前两部的致敬和补全吗？经典，必然有它存在的道理，先把台词打磨好一点再开拍吧，至少，...","alt":"https://movie.douban.com/review/8076787/","id":"8076787"},{"rating":{"max":5,"value":4,"min":0},"title":"豆瓣不都是讨论故事本身的嘛？你们逼逼个演员对比是为了啥。。","subject_id":"26284595","author":{"uid":"fantasy0808","avatar":"http://img3.douban.com/icon/u31986323-4.jpg","signature":"鸟人鸟事一堆..2009滚远点!!!!","alt":"http://www.douban.com/people/fantasy0808/","id":"31986323","name":"Jar果果爱悬疑"},"summary":"20年前的故事叫凄美，20年后的结局叫完美。我看到了编剧的脑洞，看到了华丽的特效，看到了搞笑的桥段，在没有破坏20年前版本的故事性的情况下也平复了20年前的遗憾，为何不能赞赏它？ 总是对比星爷朱茵，以后只看90...","alt":"https://movie.douban.com/review/8086324/","id":"8086324"}]
     * ratings_count : 7602
     * aka : ["大话西游终结篇","A Chinese Odyssey：Part Three","A Chinese Odyssey Part III"]
     */

    @SerializedName("reviews_count")
    public int reviewsCount;
    @SerializedName("wish_count")
    public int wishCount;
    @SerializedName("original_title")
    public String originalTitle;
    @SerializedName("collect_count")
    public int collectCount;
    /**
     * small : http://img3.douban.com/view/movie_poster_cover/ipst/public/p2377676571.jpg
     * large : http://img3.douban.com/view/movie_poster_cover/lpst/public/p2377676571.jpg
     * medium : http://img3.douban.com/view/movie_poster_cover/spst/public/p2377676571.jpg
     */

    @SerializedName("images")
    public ImagesEntity images;
    @SerializedName("douban_site")
    public String doubanSite;
    @SerializedName("year")
    public String year;
    @SerializedName("alt")
    public String alt;
    @SerializedName("id")
    public String id;
    @SerializedName("mobile_url")
    public String mobileUrl;
    @SerializedName("photos_count")
    public int photosCount;
    @SerializedName("pubdate")
    public String pubdate;
    @SerializedName("title")
    public String title;
    @SerializedName("do_count")
    public Object doCount;
    @SerializedName("has_video")
    public boolean hasVideo;
    @SerializedName("share_url")
    public String shareUrl;
    @SerializedName("seasons_count")
    public Object seasonsCount;
    @SerializedName("schedule_url")
    public String scheduleUrl;
    @SerializedName("website")
    public String website;
    @SerializedName("has_schedule")
    public boolean hasSchedule;
    @SerializedName("collection")
    public Object collection;
    @SerializedName("episodes_count")
    public Object episodesCount;
    @SerializedName("has_ticket")
    public boolean hasTicket;
    @SerializedName("current_season")
    public Object currentSeason;
    @SerializedName("mainland_pubdate")
    public String mainlandPubdate;
    @SerializedName("summary")
    public String summary;
    @SerializedName("subtype")
    public String subtype;
    @SerializedName("comments_count")
    public int commentsCount;
    @SerializedName("ratings_count")
    public int ratingsCount;
    @SerializedName("videos")
    public List<?> videos;
    @SerializedName("blooper_urls")
    public List<String> blooperUrls;
    /**
     * rating : {"max":5,"value":1,"min":0}
     * useful_count : 1132
     * author : {"uid":"122060054","avatar":"http://img3.douban.com/icon/u122060054-3.jpg","signature":"","alt":"http://www.douban.com/people/122060054/","id":"122060054","name":"土国全安"}
     * subject_id : 26284595
     * content : 心疼莫文蔚，何苦来趟这摊恶心的脏水。
     * created_at : 2016-09-12 21:15:53
     * id : 1083999998
     */

    @SerializedName("popular_comments")
    public List<PopularCommentsEntity> popularComments;
    @SerializedName("languages")
    public List<String> languages;
    /**
     * avatars : {"small":"http://img3.douban.com/img/celebrity/small/45374.jpg","large":"http://img3.douban.com/img/celebrity/large/45374.jpg","medium":"http://img3.douban.com/img/celebrity/medium/45374.jpg"}
     * name_en : Jeffrey Lau
     * name : 刘镇伟
     * alt : https://movie.douban.com/celebrity/1274431/
     * id : 1274431
     */

    @SerializedName("writers")
    public List<WritersEntity> writers;
    @SerializedName("pubdates")
    public List<String> pubdates;
    @SerializedName("tags")
    public List<String> tags;
    @SerializedName("durations")
    public List<String> durations;
    @SerializedName("genres")
    public List<String> genres;
    /**
     * medium : http://img3.douban.com/img/trailer/medium/2375419301.jpg?1471832904
     * title : 内地预告片：终极版 (中文字幕)
     * subject_id : 26284595
     * alt : https://movie.douban.com/trailer/202227/
     * small : http://img3.douban.com/img/trailer/small/2375419301.jpg?1471832904
     * resource_url : http://vt1.doubanio.com/201609152333/a121f6e65b2eb721d8d72a134ff0f88c/view/movie/M/302020227.mp4
     * id : 202227
     */

    @SerializedName("trailers")
    public List<TrailersEntity> trailers;
    @SerializedName("trailer_urls")
    public List<String> trailerUrls;
    /**
     * medium : http://img3.douban.com/img/trailer/medium/2378984821.jpg?1473399130
     * title : 花絮：刘镇伟特辑 (中文字幕)
     * subject_id : 26284595
     * alt : https://movie.douban.com/trailer/203349/
     * small : http://img3.douban.com/img/trailer/small/2378984821.jpg?1473399130
     * resource_url : http://vt1.doubanio.com/201609152333/c9fc6d47910a6085ebc998eaadc34c98/view/movie/M/302030349.mp4
     * id : 203349
     */

    @SerializedName("bloopers")
    public List<BloopersEntity> bloopers;
    @SerializedName("clip_urls")
    public List<String> clipUrls;
    /**
     * avatars : {"small":"http://img3.douban.com/img/celebrity/small/14025.jpg","large":"http://img3.douban.com/img/celebrity/large/14025.jpg","medium":"http://img3.douban.com/img/celebrity/medium/14025.jpg"}
     * name_en : Geng Han
     * name : 韩庚
     * alt : https://movie.douban.com/celebrity/1275667/
     * id : 1275667
     */

    @SerializedName("casts")
    public List<CastsEntity> casts;
    @SerializedName("countries")
    public List<String> countries;
    /**
     * thumb : http://img3.douban.com/view/photo/thumb/public/p2352908890.jpg
     * image : http://img3.douban.com/view/photo/photo/public/p2352908890.jpg
     * cover : http://img3.douban.com/view/photo/albumcover/public/p2352908890.jpg
     * alt : https://movie.douban.com/photos/photo/2352908890/
     * id : 2352908890
     * icon : http://img3.douban.com/view/photo/icon/public/p2352908890.jpg
     */

    @SerializedName("photos")
    public List<PhotosEntity> photos;
    /**
     * medium : http://img3.doubanio.com/img/trailer/medium/2374760868.jpg?1471584072
     * title : 片段 (中文字幕)
     * subject_id : 26284595
     * alt : https://movie.douban.com/trailer/202112/
     * small : http://img3.doubanio.com/img/trailer/small/2374760868.jpg?1471584072
     * resource_url : http://vt1.doubanio.com/201609152333/263e2bc696a704d5300009c87e42f5a4/view/movie/M/302020112.mp4
     * id : 202112
     */

    @SerializedName("clips")
    public List<ClipsEntity> clips;
    /**
     * avatars : {"small":"http://img3.douban.com/img/celebrity/small/45374.jpg","large":"http://img3.douban.com/img/celebrity/large/45374.jpg","medium":"http://img3.douban.com/img/celebrity/medium/45374.jpg"}
     * name_en : Jeffrey Lau
     * name : 刘镇伟
     * alt : https://movie.douban.com/celebrity/1274431/
     * id : 1274431
     */

    @SerializedName("directors")
    public List<DirectorsEntity> directors;
    /**
     * rating : {"max":5,"value":1,"min":0}
     * title : 悟空，快取了这紫霞的狗命！
     * subject_id : 26284595
     * author : {"uid":"xiaoyaozizai","avatar":"http://img3.douban.com/icon/u1892408-5.jpg","signature":"公众账号：jintiandao1984","alt":"http://www.douban.com/people/xiaoyaozizai/","id":"1892408","name":"今天道"}
     * summary :   1.这个新编故事是这样的：原来故事里的至尊宝并不是孙悟空，真正的孙悟空是个叫秦祥林的六耳猕猴；原来紫霞不是为至尊宝死的，殉情的是青霞。青霞和秦祥林借春三十娘生了个儿子叫唐僧。为了赎罪，秦祥林从天而降打...
     * alt : https://movie.douban.com/review/8085338/
     * id : 8085338
     */

    @SerializedName("popular_reviews")
    public List<PopularReviewsEntity> popularReviews;
    @SerializedName("aka")
    public List<String> aka;

    public static class RatingEntity {
        @SerializedName("max")
        public int max;
        @SerializedName("average")
        public double average;
        /**
         * 1 : 932
         * 3 : 229
         * 2 : 246
         * 5 : 641
         * 4 : 520
         */

        @SerializedName("details")
        public DetailsEntity details;
        @SerializedName("stars")
        public String stars;
        @SerializedName("min")
        public int min;

        public static class DetailsEntity {
            @SerializedName("1")
            public int value1;
            @SerializedName("3")
            public int value3;
            @SerializedName("2")
            public int value2;
            @SerializedName("5")
            public int value5;
            @SerializedName("4")
            public int value4;
        }
    }

    public static class ImagesEntity {
        @SerializedName("small")
        public String small;
        @SerializedName("large")
        public String large;
        @SerializedName("medium")
        public String medium;
    }

    public static class PopularCommentsEntity {
        /**
         * max : 5
         * value : 1
         * min : 0
         */

        @SerializedName("rating")
        public RatingEntity rating;
        @SerializedName("useful_count")
        public int usefulCount;
        /**
         * uid : 122060054
         * avatar : http://img3.douban.com/icon/u122060054-3.jpg
         * signature :
         * alt : http://www.douban.com/people/122060054/
         * id : 122060054
         * name : 土国全安
         */

        @SerializedName("author")
        public AuthorEntity author;
        @SerializedName("subject_id")
        public String subjectId;
        @SerializedName("content")
        public String content;
        @SerializedName("created_at")
        public String createdAt;
        @SerializedName("id")
        public String id;

        public static class RatingEntity {
            @SerializedName("max")
            public int max;
            @SerializedName("value")
            public int value;
            @SerializedName("min")
            public int min;
        }

        public static class AuthorEntity {
            @SerializedName("uid")
            public String uid;
            @SerializedName("avatar")
            public String avatar;
            @SerializedName("signature")
            public String signature;
            @SerializedName("alt")
            public String alt;
            @SerializedName("id")
            public String id;
            @SerializedName("name")
            public String name;
        }
    }

    public static class WritersEntity {
        /**
         * small : http://img3.douban.com/img/celebrity/small/45374.jpg
         * large : http://img3.douban.com/img/celebrity/large/45374.jpg
         * medium : http://img3.douban.com/img/celebrity/medium/45374.jpg
         */

        @SerializedName("avatars")
        public AvatarsEntity avatars;
        @SerializedName("name_en")
        public String nameEn;
        @SerializedName("name")
        public String name;
        @SerializedName("alt")
        public String alt;
        @SerializedName("id")
        public String id;

        public static class AvatarsEntity {
            @SerializedName("small")
            public String small;
            @SerializedName("large")
            public String large;
            @SerializedName("medium")
            public String medium;
        }
    }

    public static class TrailersEntity {
        @SerializedName("medium")
        public String medium;
        @SerializedName("title")
        public String title;
        @SerializedName("subject_id")
        public String subjectId;
        @SerializedName("alt")
        public String alt;
        @SerializedName("small")
        public String small;
        @SerializedName("resource_url")
        public String resourceUrl;
        @SerializedName("id")
        public String id;
    }

    public static class BloopersEntity {
        @SerializedName("medium")
        public String medium;
        @SerializedName("title")
        public String title;
        @SerializedName("subject_id")
        public String subjectId;
        @SerializedName("alt")
        public String alt;
        @SerializedName("small")
        public String small;
        @SerializedName("resource_url")
        public String resourceUrl;
        @SerializedName("id")
        public String id;
    }

    public static class CastsEntity {
        /**
         * small : http://img3.douban.com/img/celebrity/small/14025.jpg
         * large : http://img3.douban.com/img/celebrity/large/14025.jpg
         * medium : http://img3.douban.com/img/celebrity/medium/14025.jpg
         */

        @SerializedName("avatars")
        public AvatarsEntity avatars;
        @SerializedName("name_en")
        public String nameEn;
        @SerializedName("name")
        public String name;
        @SerializedName("alt")
        public String alt;
        @SerializedName("id")
        public String id;

        public static class AvatarsEntity {
            @SerializedName("small")
            public String small;
            @SerializedName("large")
            public String large;
            @SerializedName("medium")
            public String medium;
        }
    }

    public static class PhotosEntity {
        @SerializedName("thumb")
        public String thumb;
        @SerializedName("image")
        public String image;
        @SerializedName("cover")
        public String cover;
        @SerializedName("alt")
        public String alt;
        @SerializedName("id")
        public String id;
        @SerializedName("icon")
        public String icon;
    }

    public static class ClipsEntity {
        @SerializedName("medium")
        public String medium;
        @SerializedName("title")
        public String title;
        @SerializedName("subject_id")
        public String subjectId;
        @SerializedName("alt")
        public String alt;
        @SerializedName("small")
        public String small;
        @SerializedName("resource_url")
        public String resourceUrl;
        @SerializedName("id")
        public String id;
    }

    public static class DirectorsEntity {
        /**
         * small : http://img3.douban.com/img/celebrity/small/45374.jpg
         * large : http://img3.douban.com/img/celebrity/large/45374.jpg
         * medium : http://img3.douban.com/img/celebrity/medium/45374.jpg
         */

        @SerializedName("avatars")
        public AvatarsEntity avatars;
        @SerializedName("name_en")
        public String nameEn;
        @SerializedName("name")
        public String name;
        @SerializedName("alt")
        public String alt;
        @SerializedName("id")
        public String id;

        public static class AvatarsEntity {
            @SerializedName("small")
            public String small;
            @SerializedName("large")
            public String large;
            @SerializedName("medium")
            public String medium;
        }
    }

    public static class PopularReviewsEntity {
        /**
         * max : 5
         * value : 1
         * min : 0
         */

        @SerializedName("rating")
        public RatingEntity rating;
        @SerializedName("title")
        public String title;
        @SerializedName("subject_id")
        public String subjectId;
        /**
         * uid : xiaoyaozizai
         * avatar : http://img3.douban.com/icon/u1892408-5.jpg
         * signature : 公众账号：jintiandao1984
         * alt : http://www.douban.com/people/xiaoyaozizai/
         * id : 1892408
         * name : 今天道
         */

        @SerializedName("author")
        public AuthorEntity author;
        @SerializedName("summary")
        public String summary;
        @SerializedName("alt")
        public String alt;
        @SerializedName("id")
        public String id;

        public static class RatingEntity {
            @SerializedName("max")
            public int max;
            @SerializedName("value")
            public int value;
            @SerializedName("min")
            public int min;
        }

        public static class AuthorEntity {
            @SerializedName("uid")
            public String uid;
            @SerializedName("avatar")
            public String avatar;
            @SerializedName("signature")
            public String signature;
            @SerializedName("alt")
            public String alt;
            @SerializedName("id")
            public String id;
            @SerializedName("name")
            public String name;
        }
    }
}
