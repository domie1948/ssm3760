<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <%@ include file="../../static/head.jsp" %>
    <link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css"
          rel="stylesheet">
    <script type="text/javascript" charset="utf-8">
        window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
    </script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8"
            src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<style>

</style>
<body>
<!-- Pre Loader -->
<div class="loading">
    <div class="spinner">
        <div class="double-bounce1"></div>
        <div class="double-bounce2"></div>
    </div>
</div>
<!--/Pre Loader -->
<div class="wrapper">
    <!-- Page Content -->
    <div id="content">
        <!-- Top Navigation -->
        <%@ include file="../../static/topNav.jsp" %>
        <!-- Menu -->
        <div class="container menu-nav">
            <nav class="navbar navbar-expand-lg lochana-bg text-white">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu text-white"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto" id="navUl">

                    </ul>
                </div>
            </nav>
        </div>
        <!-- /Menu -->
        <!-- Breadcrumb -->
        <!-- Page Title -->
        <div class="container mt-0">
            <div class="row breadcrumb-bar">
                <div class="col-md-6">
                    <h3 class="block-title">编辑志愿者</h3>
                </div>
                <div class="col-md-6">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/index.jsp">
                                <span class="ti-home"></span>
                            </a>
                        </li>
                        <li class="breadcrumb-item">志愿者管理</li>
                        <li class="breadcrumb-item active">志愿者登记</li>
                    </ol>
                </div>
            </div>
        </div>
        <!-- /Page Title -->

        <!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container">

            <div class="row">
                <!-- Widget Item -->
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow">
                        <h3 class="widget-title">志愿者信息</h3>
                        <form id="addOrUpdateForm">
                            <div class="form-row">
                            <!-- 级联表所有字段 -->
                            <!-- 本表所有字段 -->



                                    <input id="updateId" name="id" type="hidden">

                                    <div class="form-group col-md-6">
                                        <label>账户</label>
                                        <input id="username" name="username" class="form-control"
                                               v-model="ruleForm.username" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>姓名</label>
                                        <input id="zhiyuanzheName" name="zhiyuanzheName" class="form-control"
                                               v-model="ruleForm.zhiyuanzheName" readonly>
                                    </div>


                                <div class="form-group col-md-6">
                                    <label>性别</label>
                                    <input id="zhiyuanzheSexValue" name="zhiyuanzheSexValue" class="form-control"
                                           v-model="ruleForm.zhiyuanzheSexValue" readonly>
                                </div>


                                    <div class="form-group col-md-6">
                                        <label>年龄</label>
                                        <input id="zhiyuanzheAge" name="zhiyuanzheAge" class="form-control"
                                               v-model="ruleForm.zhiyuanzheAge" readonly>
                                    </div>

                                <div class="form-group col-md-6">
                                    <label>照片</label>
                                    <img id="zhiyuanzhePhotoImg" width="100" height="100">
                                </div>

                                    <div class="form-group col-md-6">
                                        <label>工作</label>
                                        <input id="zhiyuanzheGongzuo" name="zhiyuanzheGongzuo" class="form-control"
                                               v-model="ruleForm.zhiyuanzheGongzuo" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>收入</label>
                                        <input id="zhiyuanzheJine" name="zhiyuanzheJine" class="form-control"
                                               v-model="ruleForm.zhiyuanzheJine" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>家庭地址</label>
                                        <input id="zhiyuanzheAddress" name="zhiyuanzheAddress" class="form-control"
                                               v-model="ruleForm.zhiyuanzheAddress" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>联系方式</label>
                                        <input id="zhiyuanzhePhone" name="zhiyuanzhePhone" class="form-control"
                                               v-model="ruleForm.zhiyuanzhePhone" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>身份证号</label>
                                        <input id="zhiyuanzheIdNumber" name="zhiyuanzheIdNumber" class="form-control"
                                               v-model="ruleForm.zhiyuanzheIdNumber" readonly>
                                    </div>


                                    <div class="form-group col-md-6">
                                        <label>爱好</label>
                                        <input id="zhiyuanzheAihao" name="zhiyuanzheAihao" class="form-control"
                                               v-model="ruleForm.zhiyuanzheAihao" readonly>
                                    </div>


                                <div class="form-group col-md-6">
                                    <label>是否养过宠物</label>
                                    <input id="zhiyuanzheYesnoValue" name="zhiyuanzheYesnoValue" class="form-control"
                                           v-model="ruleForm.zhiyuanzheYesnoValue" readonly>
                                </div>


                                <div class="form-group col-md-6">
                                    <label>是否启用</label>
                                    <input id="zhiyuanzheValue" name="zhiyuanzheValue" class="form-control"
                                           v-model="ruleForm.zhiyuanzheValue" readonly>
                                </div>

                                <div class="form-group col-md-12 mb-3">
                                    <button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- /Widget Item -->
            </div>
        </div>
        <!-- /Main Content -->
    </div>
    <!-- /Page Content -->
</div>
<!-- Back to Top -->
<a id="back-to-top" href="#" class="back-to-top">
    <span class="ti-angle-up"></span>
</a>
<!-- /Back to Top -->
<%@ include file="../../static/foot.jsp" %>
<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>

<script>
    <%@ include file="../../utils/menu.jsp"%>
            <%@ include file="../../static/setMenu.js"%>
            <%@ include file="../../utils/baseUrl.jsp"%>

    var tableName = "zhiyuanzhe";
    var pageType = "add-or-update";
    var updateId = "";

    var zhiyuanzheSexTypesOptions = [];
    var zhiyuanzheYesnoTypesOptions = [];
    var zhiyuanzheTypesOptions = [];

    var ruleForm = {};
    var vm = new Vue({
        el: '#addOrUpdateForm',
        data: {
            ruleForm: {},
        },
        beforeCreate: function () {
            var id = window.sessionStorage.getItem("updateId");
            if (id != null && id != "" && id != "null") {
                $.ajax({
                    type: "GET",
                    url: baseUrl + "zhiyuanzhe/info/" + id,
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));
                    },
                    success: function (res) {
                        if (res.code == 0) {
                            vm.ruleForm = res.data;
                            ruleForm = res.data;
                            showImg();
                            setContent();
                        } else if (res.code == 401) {
                        <%@ include file="../../static/toLogin.jsp"%>
                        } else {
                            alert(res.msg)
                        }
                    },
                });
            }
        },
        methods: {}
    });


    // 填充富文本框
    function setContent() {

    }


    //图片显示
    function showImg() {
        $("#zhiyuanzhePhotoImg").attr("src", ruleForm.zhiyuanzhePhoto);
    }

    function exit() {
        window.sessionStorage.removeItem("updateId");
        window.sessionStorage.removeItem('addzhiyuanzhe');
        window.location.href = "list.jsp";
    }

    // 下载
    function download(fileName) {
        var url = baseUrl+'file/download?fileName='+fileName;
        window.open(url);
    }

    //设置下载
    function setDownloadBtn() {

    }

    $(document).ready(function () {
        //设置右上角用户名
        $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
        //设置项目名
        $('.sidebar-header h3 a').html(projectName)
        setMenu();
        $('#exitBtn').on('click', function (e) {
            e.preventDefault();
            exit();
        });


    <%@ include file="../../static/myInfo.js"%>
    });
    // 用户登出
    <%@ include file="../../static/logout.jsp"%>
</script>
</body>

</html>