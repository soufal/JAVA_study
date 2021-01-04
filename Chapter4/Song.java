package Chapter4;

public class Song {
    //对象属性，即实例变量
    String title;
    String artist;


    void play() {
        //play方法
        System.out.println(title + " is playing!");
    }

    void setTitle(String titleOfSong) {
        //设置歌曲名字
        title = titleOfSong;

    }

    void  setArtist(String artistOfSong) {
        //设置歌曲的作者
        artist = artistOfSong;
    }


}
