# MyLeetCode

LeetCode 算法练习与题解仓库，以 Java 为主要语言。

根目录为 Java 项目，Python 题目生成工具独立维护在 `leetcode-generator/` 子目录。

## 仓库结构

```text
MyLeetCode/
├── src/                  # Java 源码（IntelliJ IDEA 项目）
│   ├── leetcode/         # LeetCode 题解
│   │   ├── problems/     # 标准题目 (Q0001_xxx)
│   │   ├── LCP/          # LCP 题目
│   │   ├── LCR/          # LCR 题目
│   │   ├── LCS/          # LCS 题目
│   │   └── interview/    # 面试题
│   ├── contest/          # 竞赛题目
│   ├── common/           # 公共工具类
│   └── legacy/           # 历史题解（保留原样）
│
└── leetcode-generator/   # Python 题目生成子项目（独立维护）
    ├── src/              # 生成工具源码
    ├── data/             # 原始数据（CSV）
    └── generated/leetcode/  # 生成的 Markdown 草稿
        ├── problems/     # 标准题目
        ├── LCP/          # LCP 题目
        ├── LCR/          # LCR 题目
        ├── LCS/          # LCS 题目
        └── interview/    # 面试题
```

## 维护规则

- `src/leetcode/` 下按题目来源分类，每题目录含 `.md` 说明与 `Solution.java` 代码。
- 新题目从 `leetcode-generator/generated/leetcode/` 生成草稿，人工检查后迁移至 `src/leetcode/`。
- 单题 README 保持轻量：题目链接、来源、状态、简要题意与核心思路。
- `src/common/` 为公共工具，不维护题目索引。
- `src/legacy/` 仅作历史参考，不回填到新流程。

## 同步工具

`leetcode-generator/` 是独立的 Python 项目，用于从 LeetCode CN 拉取数据并生成草稿。详见 [leetcode-generator/README.md](leetcode-generator/README.md)。
