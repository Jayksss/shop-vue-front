// module.exports = {
//   presets: [
//     '@vue/cli-plugin-babel/preset'
//   ]
// }
module.exports = {
  outputDir: "../src/main/resources/static",
  indexPath: "../static/index.html",
  devServer: {
      port : 8082 // 접속 포트 변경
    , proxy: "http://localhost:8081" //Spring Boot의 내장 was의 주소
  },
  chainWebpack: config => {
    const svgRule = config.module.rule("svg");
    svgRule.uses.clear();
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");
    config.output.filename("js/[name].js"); //build시 js에 파일 생성
  }
};