package com.xupt.javaSM;

public class YongHuJieMian {
	private final MySql mysql = new MySql();// 人物信息库
	private final MarketSql ms = new MarketSql();// 商品信息库
	private Customer user = null;

	private Administration as = null;

	public void firstJiemian() {// 一进入系统的界面
		int tag;
		GetAnswer ga = new GetAnswer();
		System.out.println("欢迎使用熊猫超市销售系统！");
		System.out.println("请选择您要进行的操作");
		do {
			System.out.println("1.登录顾客购买界面");
			System.out.println("2.使用管理员账号登录");
			System.out.println("3.注册账户：");
			System.out.println("4.注册管理员");
			System.out.println("0.退出系统：");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 4);
			switch (tag) {
			case 0:
				System.out.println("谢谢您的使用！");
				break;
			case 1:
				secondJieMian(1);
				break;
			case 2:
				secondJieMian(2);
				break;
			case 3:
				this.user = (Customer) ((new Register()).register(mysql, 1));
				break;
			case 4:
				this.as = (Administration) ((new Register()).register(mysql, 2));
			}
			if (tag == 0) {
				break;
			}
		} while (true);
	}

	public void secondJieMian(int tag1) {// 用户登录的界面
		GetAnswer ga = new GetAnswer();
		int flag = 0, tag;
		User use;
		String id, passward;
		do {
			if (tag1 == 1) {
				if (user == null) {
					System.out.println("您还未进行过注册，请返回上一界面进行注册:");
					return;
				} else {
					use = user;
				}
			} else {
				if (as == null) {
					System.out.println("您还未进行过注册，请返回上一界面进行注册:");
					return;
				} else {
					use = as;
				}
			}
			System.out.println("请输入要操作的步骤");
			System.out.println("1.输入账号密码");
			System.out.println("0.返回上一层界面：");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 1);
			if (tag == 0l) {
				break;
			}
			do {
				if (flag == 0) {
					System.out.println("请输入您的账号");
				} else {
					System.out.println("请重新输入账号");
				}
				id = ga.getString(6);

				flag = 1;
				if (mysql.judge2(id)) {
					break;
				}
			} while (true);

			System.out.println("请输入您的密码");
			passward = ga.getString2();
			System.out.println("登录中，请稍后......");
			flag = 1;
			if (use.judgeIogin(id.trim(), passward.trim())) {
				System.out.println("登陆成功，欢迎使用本系统：");
				if (use instanceof Customer) {
					marketJieMian();
				} else {
					administrationJieMian();
				}
			} else {
				System.out.println("登陆失败，账号或者密码不正确");
			}
		} while (true);
	}

	public void marketJieMian() {// 登录之后的界面
		GetAnswer ga = new GetAnswer();
		int tag;
		do {
			System.out.print("******************");
			System.out.print("主界面");
			System.out.println("******************");
			System.out.println("1、查看商品库存:");
			System.out.println("2、出售商品:");
			System.out.println("3、商品结余找零:");
			System.out.println("4、修改用户名");
			System.out.println("5、修改密码");
			System.out.println("0、退出登录");
			System.out.println("******************************************");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 5);
			switch (tag) {
			case 1:
				new UseMarket().kuCun(ms);
				break;
			case 2:
				new UseMarket().sell(user, ms);
				break;
			case 3:
				new UseMarket().jieYu(user);
				break;
			case 4:
				new ChangeInformation().getInformationOfName(user, mysql);
				break;
			case 5:
				new ChangeInformation().getInformationPassword(user, mysql);
				break;
			case 0:
				break;
			}
			if (tag == 0) {
				break;
			}
		} while (true);
	}

	public void administrationJieMian() {
		GetAnswer ga = new GetAnswer();
		int tag;
		if (this.as == null) {
			System.out.println("您还未进行过注册，请返回上一界面进行注册:");
			return;
		}
		do {
			System.out.print("******************");
			System.out.print("主界面");
			System.out.println("******************");
			System.out.println("1、查看商品库存:");
			System.out.println("2、进货:");
			System.out.println("3、查询进货详情:");
			System.out.println("4、修改用户名");
			System.out.println("5、修改密码");
			System.out.println("6、修改货物信息");
			System.out.println("0、退出登录");
			System.out.println("******************************************");
			tag = ga.getInt1();
			tag = ga.getInt2(tag, 0, 6);
			switch (tag) {
			case 1:
				new UseMarket().kuCun(ms);
				break;
			case 2:
				new JinHuo().GetGoods(ms);
				break;
			case 3:
				new UseMarket().jieYu(user);
				break;
			case 4:
				new ChangeInformation().getInformationOfName(user, mysql);
				break;
			case 5:
				new ChangeInformation().getInformationPassword(user, mysql);
				break;
			case 6:
				new ChangeGoodsInformation().Change1(ms);
			case 0:
				break;
			}
			if (tag == 0) {
				break;
			}
		} while (true);
	}
}
