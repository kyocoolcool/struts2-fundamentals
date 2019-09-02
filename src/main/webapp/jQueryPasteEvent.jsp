<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2018-12-15
  Time: 09:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #bb.over {
            background: #ccc;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="resource/js/jHtmlArea-0.8.min.js"></script>
    <script type="text/javascript" src="resource/js/jHtmlArea.ColorPickerMenu-0.8.min.js"></script>
    <script type="text/javascript" src="resource/js/jquery-ui.min.js"></script>
    <link rel="Stylesheet" type="text/css" href="resource/js/css/jquery-ui.min.css" />
    <script>
        $(document).ready(function () {

            $('#bb').on('paste', function(e){
                var content = '';

                if (isIE()) {
                    //IE allows to get the clipboard data of the window object.
                    content = window.clipboardData.getData('text');
                } else {
                    //This works for Chrome and Firefox.
                    content = e.originalEvent.clipboardData.getData('text/plain');
                }

                alert(content);
            });

            function isIE(){
                var ua = window.navigator.userAgent;

                return ua.indexOf('MSIE ') > 0 || ua.indexOf('Trident/') > 0 || ua.indexOf('Edge/') > 0
            }
        });
    </script>

</head>
<body>

<textarea id="bb">12345<br>
                    ttttt</textarea>
<p id="cc">Click or double click here.</p>
<div>
    <input type="text" id='txt'>
</div>

</body>
</html>
