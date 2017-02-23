package lxacoder.okmovie.model.rank.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lxacoder on 2016/10/1.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankHeaderBean {

    /**
     * newsID : 1560213
     * title : 黄金周最适合一口闷的好剧
     * type : 0
     * imageUrl : http://img5.mtime.cn/mg/2016/10/01/091028.22239907.jpg
     */

    @SerializedName("news")
    public NewsEntity news;
    /**
     * trailerID : 62737
     * title : 《世界之外》预告片
     * imageUrl : http://img5.mtime.cn/mg/2016/09/30/151642.44317949.jpg
     * mp4Url : http://vfx.mtime.cn/Video/2016/09/30/mp4/160930094030475199_480.mp4
     * hightUrl : http://vfx.mtime.cn/Video/2016/09/30/mp4/160930094030475199.mp4
     * movieId : 220809
     */

    @SerializedName("trailer")
    public TrailerEntity trailer;
    /**
     * reviewID : 7978501
     * title : 画风清奇，一看就不是正经动画
     * posterUrl : http://img31.mtime.cn/mt/2016/08/01/103550.84712360_1280X720X2.jpg
     * movieName : 首尔站
     * imageUrl : http://img5.mtime.cn/mg/2016/09/30/102336.89980235.jpg
     */

    @SerializedName("review")
    public ReviewEntity review;
    /**
     * id : 10792
     * imageUrl : http://img31.mtime.cn/mg/2015/03/31/100230.43767720.jpg
     */

    @SerializedName("viewingGuide")
    public ViewingGuideEntity viewingGuide;
    /**
     * id : 1437
     * title : The Playlist评21世纪50佳动画
     * imageUrl : http://img31.mtime.cn/mg/2016/07/27/101410.41919656.jpg
     * type : 0
     */

    @SerializedName("topList")
    public TopListEntity topList;

    public static class NewsEntity {
        @SerializedName("newsID")
        public int newsID;
        @SerializedName("title")
        public String title;
        @SerializedName("type")
        public int type;
        @SerializedName("imageUrl")
        public String imageUrl;
    }

    public static class TrailerEntity {
        @SerializedName("trailerID")
        public int trailerID;
        @SerializedName("title")
        public String title;
        @SerializedName("imageUrl")
        public String imageUrl;
        @SerializedName("mp4Url")
        public String mp4Url;
        @SerializedName("hightUrl")
        public String hightUrl;
        @SerializedName("movieId")
        public int movieId;
    }

    public static class ReviewEntity {
        @SerializedName("reviewID")
        public int reviewID;
        @SerializedName("title")
        public String title;
        @SerializedName("posterUrl")
        public String posterUrl;
        @SerializedName("movieName")
        public String movieName;
        @SerializedName("imageUrl")
        public String imageUrl;
    }

    public static class ViewingGuideEntity {
        @SerializedName("id")
        public String id;
        @SerializedName("imageUrl")
        public String imageUrl;
    }

    public static class TopListEntity {
        @SerializedName("id")
        public int id;
        @SerializedName("title")
        public String title;
        @SerializedName("imageUrl")
        public String imageUrl;
        @SerializedName("type")
        public int type;
    }
}
