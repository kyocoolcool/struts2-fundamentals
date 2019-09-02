<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%
    ResourceBundle resource = ResourceBundle.getBundle("systemInfo");
%>


<!--[if IE 8]> <html class="lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <title>Remodal example</title>
    <meta name="description" content="Remodal example">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="dist/remodal.css">
    <link rel="stylesheet" href="dist/remodal-default-theme.css">
    <style>
        .remodal-bg.with-red-theme.remodal-is-opening,
        .remodal-bg.with-red-theme.remodal-is-opened {
            filter: none;
        }

        .remodal-overlay.with-red-theme {
            background-color: #f44336;
        }

        .remodal.with-red-theme {
            background: #fff;
        }
    </style>
</head>
<body>
<%--<div class="remodal-bg">--%>
    <%--<a href="#modal" id="modal1">Modal №1</a><br>--%>
    <%--<a href="#modal2">Modal №2</a>--%>
    <%--<br><br>--%>
<%--</div>--%>
<%--<h1><%=resource.getString("AppName") %></h1>--%>
<div class="remodal" data-remodal-id="modal" role="dialog" aria-labelledby="modal1Title" aria-describedby="modal1Desc">
    <button data-remodal-action="close" class="remodal-close" aria-label="Close"></button>
    <div>
        <h2 id="modal1Title">WebAPIS Tips</h2>
        <p id="modal1Desc">
            <%=resource.getString("AppName") %>
            <%--<%=prop.getProperty("AppName") %>--%>
            <%--Responsive, lightweight, fast, synchronized with CSS animations, fully customizable modal window plugin--%>
            <%--with declarative state notation and hash tracking.--%>
        </p>
    </div>
    <br>
    <%--<button data-remodal-action="cancel" class="remodal-cancel">Cancel</button>--%>
    <button data-remodal-action="confirm" class="remodal-confirm">OK</button>
</div>

<%--<div data-remodal-id="modal2" role="dialog" aria-labelledby="modal2Title" aria-describedby="modal2Desc">--%>
    <%--<div>--%>
        <%--<h2 id="modal2Title">Another one window</h2>--%>
        <%--<p id="modal2Desc">--%>
            <%--Hello!--%>
        <%--</p>--%>
    <%--</div>--%>
    <%--<br>--%>
    <%--<button data-remodal-action="confirm" class="remodal-confirm">Hello!</button>--%>
<%--</div>--%>

<%
    Boolean newSession=session.isNew();
%>

<!-- You can define the global options -->
<script>
    // window.REMODAL_GLOBALS = {
    //   NAMESPACE: 'remodal',
    //   DEFAULTS: {
    //     hashTracking: true,
    //     closeOnConfirm: true,
    //     closeOnCancel: true,
    //     closeOnEscape: true,
    //     closeOnOutsideClick: true,
    //     modifier: ''
    //   }
    // };
</script>

<!--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>-->
<script src="libs/jquery.min.js"></script>
<!--<script>window.jQuery || document.write('<script src="libs/jquery/dist/jquery.min.js"><\/script>')</script>-->
<script src="dist/remodal.js"></script>

<!-- Events -->
<script>
    $(document).ready(function()
    {
        var realSession=<%=newSession%>
        console.log(realSession);
        if(realSession){
            // var href = $('#modal1').attr('href');
            // console.log(href);
            // window.location.href = href;
            // var href = $('#modal1').attr('href');
            // console.log(href);
            window.location.href = '#modal';
        }
    });

    $(document).on('opening', '.remodal', function () {
        console.log('opening');
    });

    $(document).on('opened', '.remodal', function () {
        console.log('opened');
    });

    $(document).on('closing', '.remodal', function (e) {
        console.log('closing' + (e.reason ? ', reason: ' + e.reason : ''));
    });

    $(document).on('closed', '.remodal', function (e) {
        console.log('closed' + (e.reason ? ', reason: ' + e.reason : ''));
    });

    $(document).on('confirmation', '.remodal', function () {
        console.log('confirmation');
    });

    $(document).on('cancellation', '.remodal', function () {
        console.log('cancellation');
    });

    //  Usage:
    //  $(function() {
    //
    //    // In this case the initialization function returns the already created instance
    //    var inst = $('[data-remodal-id=modal]').remodal();
    //
    //    inst.open();
    //    inst.close();
    //    inst.getState();
    //    inst.destroy();
    //  });

    //  The second way to initialize:
    // $('[data-remodal-id=modal2]').remodal({
    //     modifier: 'with-red-theme'
    // });
</script>
</body>
</html>
