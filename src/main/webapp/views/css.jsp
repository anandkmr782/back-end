<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
p {
  color: navy;
  font-size:25px;
  font-family:san-sarif;
  justify-content:center;
}
input{
  width: 97%;
  padding: 12px 20px;
  margin: 8px 0;
  font-size:20px
  box-sizing: border-box;
  border: 2px solid red;
  border-radius: 8px;
  }
  button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  border-radius:15px;
  font-size: 16px;
}
</style>
</head>
<body>
Select Voice: <select id='voiceList'></select> <br><br>

    <input id='txtInput'/> <br><br>    
    <button id='btnSpeak'>Speak!</button>

    <script>
        var txtInput = document.querySelector('#txtInput');
        var voiceList = document.querySelector('#voiceList');
        var btnSpeak = document.querySelector('#btnSpeak');
        var synth = window.speechSynthesis;
        var voices = [];

        PopulateVoices();
        if(speechSynthesis !== undefined){
            speechSynthesis.onvoiceschanged = PopulateVoices;
        }

        btnSpeak.addEventListener('click', ()=> {
            var toSpeak = new SpeechSynthesisUtterance(txtInput.value);
            var selectedVoiceName = voiceList.selectedOptions[0].getAttribute('data-name');
            voices.forEach((voice)=>{
                if(voice.name === selectedVoiceName){
                    toSpeak.voice = voice;
                }
            });
            synth.speak(toSpeak);
        });

        function PopulateVoices(){
            voices = synth.getVoices();
            var selectedIndex = voiceList.selectedIndex < 0 ? 0 : voiceList.selectedIndex;
            voiceList.innerHTML = '';
            voices.forEach((voice)=>{
                var listItem = document.createElement('option');
                listItem.textContent = voice.name;
                listItem.setAttribute('data-lang', voice.lang);
                listItem.setAttribute('data-name', voice.name);
                voiceList.appendChild(listItem);
            });

            voiceList.selectedIndex = selectedIndex;
        }
    </script>
<p>
<h1>CSS(Cascading Style Sheets)</h1><br><br>
<p>Cascading Style Sheets is a style sheet language used for describing the presentation of a document written in a markup language such as HTML.<br>
CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript<br>
CSS stands for Cascading Style Sheets<br>
CSS describes how HTML elements are to be displayed on screen, paper, or in other media<br>
CSS saves a lot of work. It can control the layout of multiple web pages all at once<br>
External stylesheets are stored in CSS files<br>
CSS tutorial or CSS 3 tutorial provides basic and advanced concepts of CSS technology. Our CSS tutorial is developed for beginners and professionals.<br><br>
The major points of CSS are given below:<br><br>

CSS stands for Cascading Style Sheet.<br>
CSS is used to design HTML tags.<br>
CSS is a widely used language on the web.<br>
HTML, CSS and JavaScript are used for web designing. It helps the web designers to apply style on HTML tags.<br>

</p>
</p>
<script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-60b447486a3443fd"></script>
</body>
</html>