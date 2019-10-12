<template>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span style="font-weight: bold;font-size: 20px">最近更新</span>
      <!--<el-button style="float: right; padding: 3px 0" type="text">修改</el-button>-->
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item timestamp="2019/10/13" placement="top">
          <el-card>
            <h4>实现图书分类功能</h4>
            <p>jingshaoyi 提交于 2019/10/13 12:02</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/10/12" placement="top">
          <el-card>
            <h4>实现图书分页，修复图书添加的 BUG</h4>
            <p>jingshaoyi 提交于 2019/10/12 12:10</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/10/11" placement="top">
          <el-card>
            <h4>实现搜索框模糊查询</h4>
            <p>jingshaoyi 提交于 2019/10/11 19:51</p>
          </el-card>
        </el-timeline-item>
        <el-timeline-item timestamp="2019/10/8" placement="top">
          <el-card>
            <h4>实现图书修改功能</h4>
            <p>jingshaoyi 提交于 2019/10/08 22:52</p>
          </el-card>
        </el-timeline-item>
      </el-timeline>
    </div>
  </el-card>
</template>

<script>
  export default {
    name: 'UpdateCard'
  }
</script>

<style scoped>
  .box-card {
    margin-top: 5px;
    width: 988px;
    height: 850px;
    text-align: left;
  }
</style>
