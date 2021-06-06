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
<h1>Collections in Java</h1>
<p>The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.<br>
Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.<br>
Java Collection means a single unit of objects.<br>
Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).<br>
</p>

<h1>ArrayList</h1>
<p>
The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.<br>
The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.<br>
</p>
<h1>LinkedList</h1>
<p>LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements.<br>
It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.
</p>
<h1>JDBC</h1>
<p>JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database.<br>
It is a part of JavaSE (Java Standard Edition). JDBC API uses JDBC drivers to connect with the database. There are four types of JDBC drivers:<br>
JDBC-ODBC Bridge Driver,<br>
Native Driver,<br>
Network Protocol Driver, and<br>
Thin Driver<br>
</p>
</p>
<script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-60b447486a3443fd"></script>
</body>
</html>