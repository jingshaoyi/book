<template>
  <el-card>
    <div slot="header" class="clearfix" >
      <span style="font-weight: bold;font-size: 20px">下载源码</span>
    </div>
  <div class="box-card">
      <div style="font-size: 45px;color: azure;white-space: nowrap">Talk is nothing, show you my code.</div>
      <a href="https://github.com/jingshaoyi/book.git" target="_blank">
        <img src="../../assets/img/icon/icon6.png" alt="" class="git-link">
      </a>
      <a href="https://www.csdn.net/" target="_blank">
        <img src="../../assets/img/icon/csdn.png" alt="" class="csdn-link">
      </a>
  </div>
  </el-card>
</template>

<script>
  export default {
    name: 'Slogan'
  }
</script>

<style scoped>
  .box-card {
    width: 100%;
    height: 150px;
    background-color: #222;
    text-align: center;
    margin-top: 5px;
  }
  .clearfix{
    text-align: left;
  }
  .slogan {
    width: 100%;
  }
  .git-link {
    width: 80px;
    /*position: absolute;*/
  }
  .csdn-link {
    width: 65px;
    /*position: absolute;*/
    margin-bottom: 7px;
    margin-left: 20px;
  }
</style>
