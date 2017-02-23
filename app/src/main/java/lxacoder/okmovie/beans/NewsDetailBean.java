package lxacoder.okmovie.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lxacoder on 2016/9/9.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */
public class NewsDetailBean {

    /**
     * type : 0
     * id : 1559504
     * title : 《宾虚》票房扑街成暑期档最大输家
     * title2 : "圆梦巨人""爱丽丝2"紧随其后 米高梅输惨
     * content : <div><div><div><div><div><img src="http://img31.mtime.cn/CMS/News/2016/09/09/115513.92945783_620X620.jpg" width="310"><em></em></div></div><div>　　由提莫·贝克曼贝托夫执导的新版《宾虚》成为这个暑期档最大的票房输家，据悉其损失高达1.2亿美元。另外，史蒂文·斯皮尔伯格执导的的《圆梦巨人》和迪士尼发行的《爱丽丝梦游仙境2：镜中奇遇记》仅次于《宾虚》，成为另两个输家。</div><div><br></div><div>　　派拉蒙和米高梅作为《宾虚》的制作和发行方，自八月中旬以来《宾虚》全球票房仅赚得5410万多美元，包括在美国本土获得的区区2500万美元。尽管还有很多主要海外市场有待开拓，但是仍然前景堪忧。</div><div><br></div><div>　　除了市场推广费用，《宾虚》光是制作费就高达1亿美元，1.2亿的损失费用是综合了票房收入和发行推广费用以及租售收入和其他附加收入（家庭影院和电视版权等）计算得出的。</div><div><br></div><div>　　米高梅将承担主要的经济损失，因为其为《宾虚》投入了超过80%的预算和大部分的市场推广费用，尽管米高梅已经通过在部分海外市场出售版权减小了一些损失。而派拉蒙仅仅亏损了大约1300万美元。</div><div><br></div><div>　　米高梅官方对于巨额亏损一事拒绝评论。不过据悉，本周三米高梅公司上报股东其2016年财报预期收入降低，因为第三季度《宾虚》将带来巨大亏损。</div><div><br></div></div></div></div>
     * time : 2016-9-9 12:08:58
     * source : Mtime时光网
     * author :
     * editor : 另一个Veronica
     * url : http://news.mtime.com/2016/09/09/1559504.html
     * wapUrl : http://news.wap.mtime.com/2016/09/09/1559504.html
     * relations : [{"type":1,"id":207862,"name":"爱丽丝梦游仙境2：镜中奇遇记","image":"http://img31.mtime.cn/mt/2016/05/12/170809.66116241_1280X720X2.jpg","year":"2016","rating":6.9,"scoreCount":2638,"releaseDate":"2016年5月27日","relaseLocation":"中国"},{"type":1,"id":215177,"name":"圆梦巨人","image":"http://img31.mtime.cn/mt/2016/05/16/102207.44728370_1280X720X2.jpg","year":"2016","rating":7.5,"scoreCount":36,"releaseDate":"2016年7月1日","relaseLocation":"美国"},{"type":1,"id":216328,"name":"宾虚","image":"http://img31.mtime.cn/mt/2016/04/07/101316.58839508_1280X720X2.jpg","year":"2016","rating":-1,"scoreCount":19,"releaseDate":"2016年8月19日","relaseLocation":"美国"}]
     * previousNewsID : 0
     * nextNewsID : 1559501
     * commentCount : 1
     */

    @SerializedName("type")
    public int type;
    @SerializedName("id")
    public int id;
    @SerializedName("title")
    public String title;
    @SerializedName("title2")
    public String title2;
    @SerializedName("content")
    public String content;
    @SerializedName("time")
    public String time;
    @SerializedName("source")
    public String source;
    @SerializedName("author")
    public String author;
    @SerializedName("editor")
    public String editor;
    @SerializedName("url")
    public String url;
    @SerializedName("wapUrl")
    public String wapUrl;
    @SerializedName("previousNewsID")
    public int previousNewsID;
    @SerializedName("nextNewsID")
    public int nextNewsID;
    @SerializedName("commentCount")
    public int commentCount;
    /**
     * type : 1
     * id : 207862
     * name : 爱丽丝梦游仙境2：镜中奇遇记
     * image : http://img31.mtime.cn/mt/2016/05/12/170809.66116241_1280X720X2.jpg
     * year : 2016
     * rating : 6.9
     * scoreCount : 2638
     * releaseDate : 2016年5月27日
     * relaseLocation : 中国
     */

    @SerializedName("relations")
    public List<RelationsEntity> relations;

    public static class RelationsEntity {
        @SerializedName("type")
        public int type;
        @SerializedName("id")
        public int id;
        @SerializedName("name")
        public String name;
        @SerializedName("image")
        public String image;
        @SerializedName("year")
        public String year;
        @SerializedName("rating")
        public double rating;
        @SerializedName("scoreCount")
        public int scoreCount;
        @SerializedName("releaseDate")
        public String releaseDate;
        @SerializedName("relaseLocation")
        public String relaseLocation;
    }
}
