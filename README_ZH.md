# Chrono

## 用于记录历史纪念日的应用程序 (目前为DEMO)

> [English](./README_EN.md) | [正體中文](./README.md) | **简体中文**

曾经写了一个HTML页面，有著类似的功能。但是前段时间电脑硬盘炸了……因此就有了这个软件

目前数据内容还是硬编码，等我忙完之后再进行修改

---

<div style="display: flex; gap: 10px; justify-content: center;">
    <img src = "./img/Screenshot_20250817_180224.png" alt = "主頁面" style = "width:35%;">
    <img src = "./img/Screenshot_20250817_180323.png" alt = "對話框" style = "width:35%;">
</div>

---

### 目前要如何使用该程式？

1. 需要你有Android Studio / 其他方式可以编译成APP的方式
2. fork该项目
3. 打开项目的 `app/src/main/java/com/candy/list/` 目录
4. 修改 `Main_View.kt` 文件中 `Main_View` 可组合函数体内的 `Text` 可组合函数中的 `text` 参数，这个是页面的最上方的主标题
5. 打开项目的 `app/src/main/java/com/candy/list/data` 目录。
6. 修改 `Data.kt` 文件中的集合容器数据

---

### 未来要改进添加的功能

- [ ] 记时动态显示，精确到秒钟
- [ ] 可在软件内添加数据
- [ ] 主题功能
- [ ] 卡片设计2 并可以在应用内切换
- [ ] 记录分类功能
- [ ] 线程优化
