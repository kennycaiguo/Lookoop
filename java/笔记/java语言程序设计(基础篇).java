/**
 * @description: java语言程序设计(基础篇)笔记
 * @author : Yauno
 * @date : 2018-7-16
*/
1. 关键术语
encoding scheme (硬件)
interpreter 解释器
Java Development Toolkit (JDK)
Java language specification java语言规范
motherboard 主板
pixel 像素
runtime error 运行时错
statement 语句
statement terminator 语句结束符
casting 类型转换
primitive data type 基本数据类型
presudocode 伪代码
requirement specification 需求规范
UNIX epoch UNIX时间戳
wildchard import 通配符导入
dangling-else ambigutiy 悬空else歧义
fall-through behavior 落空行为
operation associativity 操作符结合规范
operation precedence 操作符优先级
short-circuit evaluation 短路运算

2. 第二章 基本程序设计
 1) 基本语法
	Scanner input = new Scanner(System.in); // 从控制台读取输入初始化
	double number = input.nextDouble(); // 读取输入

	// 现实当前时间
	long totalMilliseconds = System.currentTimeMills(); // 返回从GMT 1970年一月一日00:00开始到当前时刻的毫秒数
 2)软件开发过程
	多阶段过程：需求规范，分析，设计，实现，测试，部署，维护。
	需求规范：理解软件需要处理的问题，将软件系统需要做的详细记录到文档中，涉及用户和开发者之间紧密的接触。
	系统分析：分析数据流，并且确定系统的输入和输出。
	系统设计：设计从输入获得输出的过程，涉及使用多层的抽象，将问题分解为可管理的组成部分，并且设计执行每个组成部分的策略。
	系统分析和设计的本质是输入、处理和输出(IPO).
	实现：将设计翻译成程序。
	测试：确保代码符合需求规范，并且排除错误。
	部署：是软件可以被使用。
	维护：对软件产品进行更新和改进。
3. 一些知识点记录
	unicode 为16位 占两个字节，用 u\开头的四位十六进制表示，范围为 'u\000'-'u\uFFF'
	ASCII码：'0'-'9': 48-57 //十进制表示
			 'A'-'z': 65-90
			 'a'-'z': 97-122