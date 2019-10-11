<template>
  <div >
    <div slot="header" class="clearfix">
    <span style="font-weight: bold;font-size: 20px">关于我们</span>
    <!--<el-button style="float: right; padding: 3px 0" type="text">修改</el-button>-->
  </div>
    <div style="border-top:1px #f0f0f0 solid;" class="footer">
      <p class="alt" style="line-height:0">&copy; 版权所有：靖少毅&nbsp;
        <span>技术支持：</span>
        <a href="###" target="_blank" style="">靖少毅</a>
      </p>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'Footer'
  }
</script>

<style scoped>
  /*通用开始*/
  * {
    margin: 0;
    padding: 0;
    font-family: '微软雅黑', Arial, Helvetica, sans-serif;
  }
  .clearfix{
    text-align: left;
  }
  body {
    font-size: 12px;
  }
  div {
    font-size: 12px;
  }
  span {
    font-size: 12px;
  }
  /*通用结束*/
  .footer {
    background: #ffffff;
    /*background: black;*/
  }
  .footer .alt {
    overflow: hidden;
    padding: 20px 0;
    width: 1160px;
    margin: auto;
  }
  .footer .alt .foot {
    width: 138px;
    float: left;
  }
  .footer .alt .foot p {
    color: #FFF;
    line-height: 28px;
  }
  a{
    text-decoration: none;
  }
  .footer .alt .foot a {
    color: #000;
    display: block;
    line-height: 24px;
  }
</style>
