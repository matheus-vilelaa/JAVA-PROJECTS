package OOPChallenge.Iphone;


import OOPChallenge.IphoneFunctions.MusicPlayer.MusicPLayer;
import OOPChallenge.IphoneFunctions.PhoneCall.PhoneCall;
import OOPChallenge.IphoneFunctions.WebBrowser.WebBrowser;

public class Iphone implements MusicPLayer, PhoneCall, WebBrowser {

    public void play() {
        System.out.println("Playing music.");
    }

    public void pause() {
        System.out.println("Music paused.");
    }

    public void selectMusic() {
        System.out.println("Music selected.");
    }

    public void call() {
        System.out.println("Making a call.");
    }

    public void answerCall() {
        System.out.println("Answering a call.");
    }

    public void playVoiceMail() {
        System.out.println("Playing voice mail.");
    }

    public void homePage() {
        System.out.println("Web browser opened.");
    }

    public void addNewPage() {
        System.out.println("Adding a new page.");
    }

    public void refreshPage() {
        System.out.println("Refreshing web page.");
    }

    public static void main(String[] args) {
        MusicPLayer musicPLayer  = new Iphone();

        System.out.println("Music player:");
        musicPLayer.play();
        musicPLayer.pause();
        musicPLayer.selectMusic();
        System.out.println(" ");

        PhoneCall phoneCall = new Iphone();

        System.out.println("Phone call:");
        phoneCall.call();
        phoneCall.answerCall();
        phoneCall.playVoiceMail();
        System.out.println(" ");

        WebBrowser webBrowser = new Iphone();

        System.out.println("Web browser:");
        webBrowser.homePage();
        webBrowser.addNewPage();
        webBrowser.refreshPage();
    }
}
