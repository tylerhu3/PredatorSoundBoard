# PredatorSoundBoard
Simple application of a app using the MediaPlayer library.

There isn't too much to this app, you press a button and a sound plays, as with most soundboards. This is more for demo purposes than annything else. It comprises of a few Buttons laided out on a activity and presses of any of those Buttons triggers the onClick Method of the MainActivity.java where it then decides what sound to play.

For future revisions:
As of current, for each sound, there's its own MediaPlayer object created, which is memory wasteful but I didn't really thing much of it at the time of writing the code since I figured there would only be about 8 total buttons I would make. However, for any future sound projects: I will definitely have to try and limite the number of MediaPlayer objects I make, preferably just one and then reuse it with each button press.

<div>
<img src="https://user-images.githubusercontent.com/30193978/34647600-12b84dc0-f33b-11e7-89d2-6e5fe6d0bc30.jpg" width="380" height="650">
<img src="https://user-images.githubusercontent.com/30193978/34647601-12d34e36-f33b-11e7-8b69-5d0f811b542a.jpg" width="380" height="650">
</div>
