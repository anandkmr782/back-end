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
<p>History of Html</p>
<h3>What is html?</h3>
<p>
HTML was created by Sir Tim Berners-Lee in late 1991 but was not released officially,published in 1995 as HTML 2.0.<br>
HTML 4.01 was published in late 1999 and was a major version of HTML.<br>
HTML is a very evolving markup language and has evolved with various versions updating.<br>

HTML tutorial or HTML 5 tutorial provides basic and advanced concepts of HTML. Our HTML tutorial is developed for beginners and professionals.<br>
In our tutorial, every topic is given step-by-step so that you can learn it in a very easy way. If you are new in learning HTML,<br>
then you can learn HTML from basic to a professional level and after learning HTML with CSS and JavaScript you will be able to create your own interactive and dynamic website.<br>
But Now We will focus on HTML only in this tutorial.<br><br><br>

The major points of HTML are given below:<br><br>

HTML stands for HyperText Markup Language.<br>
HTML is used to create web pages and web applications.<br>
HTML is widely used language on the web.<br>
We can create a static website by HTML only.<br>
Technically, HTML is a Markup language rather than a programming language.<br>
</p>
u
</body>
</html>