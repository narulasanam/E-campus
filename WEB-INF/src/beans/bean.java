package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;

public class bean 
{
String username,password,dcode,name,type,email,gender,address,phone,dateofbirth,hobbies,status,image;
String registration_no,ccode,school,yearofjoining,teacher_no,office,graduation,postgraduation,dateofjoining;
String dname,cname,ctype;
String albumname,description;
String photoname,phototitle,search_string;
int photoid,albumid;
String sentto,frm,dat,time,message,msgid,msg1;
String groupname,groupabout,groupowner;
int groupid,topicid,replyid,tmsgid,newsid;
String topicname,tcomment,commentor,imgusername,cimage,creator;
String newstitle,newsinfo,newsowner; 
String user1,user2;
int chatid,chatstatus;
int onlineid;
String atowner,attachment,title,videoowner,video;

ArrayList a1=new ArrayList();
boolean p;
int i=0;




public String getVideo() {
	return video;
}
public void setVideo(String video) {
	this.video = video;
}
public String getVideoowner() {
	return videoowner;
}
public void setVideoowner(String videoowner) {
	this.videoowner = videoowner;
}
public String getAtowner() {
	return atowner;
}
public void setAtowner(String atowner) {
	this.atowner = atowner;
}
public String getAttachment() {
	return attachment;
}
public void setAttachment(String attachment) {
	this.attachment = attachment;
}
public int getOnlineid() {
	return onlineid;
}
public void setOnlineid(int onlineid) {
	this.onlineid = onlineid;
}
public int getChatid() {
	return chatid;
}
public void setChatid(int chatid) {
	this.chatid = chatid;
}
public int getChatstatus() {
	return chatstatus;
}
public void setChatstatus(int chatstatus) {
	this.chatstatus = chatstatus;
}
public String getUser1() {
	return user1;
}
public void setUser1(String user1) {
	this.user1 = user1;
}
public String getUser2() {
	return user2;
}
public void setUser2(String user2) {
	this.user2 = user2;
}
public String getNewsowner() {
	return newsowner;
}
public void setNewsowner(String newsowner) {
	this.newsowner = newsowner;
}
public int getNewsid() {
	return newsid;
}
public void setNewsid(int newsid) {
	this.newsid = newsid;
}
public String getNewsinfo() {
	return newsinfo;
}
public void setNewsinfo(String newsinfo) {
	this.newsinfo = newsinfo;
}
public String getNewstitle() {
	return newstitle;
}
public void setNewstitle(String newstitle) {
	this.newstitle = newstitle;
}
public String getCreator() {
	return creator;
}
public void setCreator(String creator) {
	this.creator = creator;
}
public String getGroupowner() {
	return groupowner;
}
public void setGroupowner(String groupowner) {
	this.groupowner = groupowner;
}
public String getCimage() {
	return cimage;
}
public void setCimage(String cimage) {
	this.cimage = cimage;
}
public String getImgusername() {
	return imgusername;
}
public void setImgusername(String imgusername) {
	this.imgusername = imgusername;
}
public String getCommentor() {
	return commentor;
}
public void setCommentor(String commentor) {
	this.commentor = commentor;
}
public int getTmsgid() {
	return tmsgid;
}
public void setTmsgid(int tmsgid) {
	this.tmsgid = tmsgid;
}


public int getReplyid() {
	return replyid;
}
public void setReplyid(int replyid) {
	this.replyid = replyid;
}
public String getTcomment() {
	return tcomment;
}
public void setTcomment(String tcomment) {
	this.tcomment = tcomment;
}
public int getTopicid() {
	return topicid;
}
public void setTopicid(int topicid) {
	this.topicid = topicid;
}
public String getTopicname() {
	return topicname;
}
public void setTopicname(String topicname) {
	this.topicname = topicname;
}
public int getGroupid() {
	return groupid;
}
public void setGroupid(int groupid) {
	this.groupid = groupid;
}
public String getGroupabout() {
	return groupabout;
}
public void setGroupabout(String groupabout) {
	this.groupabout = groupabout;
}
public String getGroupname() {
	return groupname;
}
public void setGroupname(String groupname) {
	this.groupname = groupname;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}

public String getMsgid() {
	return msgid;
}
public void setMsgid(String msgid) {
	this.msgid = msgid;
}
public String getDat() {
	return dat;
}
public void setDat(String dat) {
	this.dat = dat;
}
public String getFrm() {
	return frm;
}
public void setFrm(String frm) {
	this.frm = frm;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getSentto() {
	return sentto;
}
public void setSentto(String sentto) {
	this.sentto = sentto;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getPhototitle() {
	return phototitle;
}
public void setPhototitle(String phototitle) {
	this.phototitle = phototitle;
}
public String getSearch_string() {
	return search_string;
}
public void setSearch_string(String search_string) {
	this.search_string = search_string;
}
public int getAlbumid() {
	return albumid;
}
public void setAlbumid(int albumid) {
	this.albumid = albumid;
}
public int getPhotoid() {
	return photoid;
}
public void setPhotoid(int photoid) {
	this.photoid = photoid;
}
public String getPhotoname() {
	return photoname;
}
public void setPhotoname(String photoname) {
	this.photoname = photoname;
}

public String getAlbumname() {
	return albumname;
}
public void setAlbumname(String albumname) {
	this.albumname = albumname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCcode() {
	return ccode;
}
public void setCcode(String ccode) {
	this.ccode = ccode;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getDateofjoining() {
	return dateofjoining;
}
public void setDateofjoining(String dateofjoining) {
	this.dateofjoining = dateofjoining;
}
public String getDcode() {
	return dcode;
}
public void setDcode(String dcode) {
	this.dcode = dcode;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getGraduation() {
	return graduation;
}
public void setGraduation(String graduation) {
	this.graduation = graduation;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hoobies) {
	this.hobbies = hoobies;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOffice() {
	return office;
}
public void setOffice(String office) {
	this.office = office;
}
public boolean isP() {
	return p;
}
public void setP(boolean p) {
	this.p = p;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPostgraduation() {
	return postgraduation;
}
public void setPostgraduation(String postgraduation) {
	this.postgraduation = postgraduation;
}
public String getRegistration_no() {
	return registration_no;
}
public void setRegistration_no(String registration_no) {
	this.registration_no = registration_no;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getTeacher_no() {
	return teacher_no;
}
public void setTeacher_no(String teacher_no) {
	this.teacher_no = teacher_no;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getYearofjoining() {
	return yearofjoining;
}
public void setYearofjoining(String yearofjoining) {
	this.yearofjoining = yearofjoining;
}
public boolean search() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,username);

		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			password=rs.getString("password");
			
			p=true;
		}
		else
			p=false;
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return p;
}
public boolean login() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username=?";
		 String s4="select * from user_profile where username=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 PreparedStatement ps1=con.prepareStatement(s4);
		 
		 ps.setString(1,username);
		 ps1.setString(1,username);

		ResultSet rs= ps.executeQuery();
		ResultSet rs1= ps1.executeQuery();
		
		if(rs1.next())
		{
			type=rs1.getString("type");
			status=rs1.getString("status");
		}
		if(rs.next())
		{
			password=rs.getString("password");
			
			p=true;
		}
		else
			p=false;
		 
		con.close();
	 }catch(SQLException e){throw new ServletException(e);}

	 return p;
}
public boolean adminlogin() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from admin where adminname=?";
		
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,username);
		 
		ResultSet rs= ps.executeQuery();
		
			if(rs.next())
		{
			password=rs.getString("password");
			image=rs.getString("image");
			p=true;
		}
		else
			p=false;
		 
		con.close();
	 }catch(SQLException e){throw new ServletException(e);}

	 return p;
}
public void addstudent() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="insert into logincheck values(?,?)";
		 String s4="insert into user_profile values(?,?,?,?,?,?,?,?,?,?,?,?)";
		 String s5="insert into student_profile values(?,?,?,?,?)";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,username);
		 psi.setString(2,password);
		 
		 psi.executeQuery();
		 
		 
		 
		 ps.setString(1,username);
		 ps.setString(2,type);
		 ps.setString(3,dcode);
		 ps.setString(4,name);
		 ps.setString(5,email);
		 ps.setString(6,gender);
		 ps.setString(7,address);
		 ps.setString(8,phone);
		 ps.setString(9,dateofbirth);
		 ps.setString(10,hobbies);
		 ps.setString(11,status);
		 ps.setString(12,"stuim.gif");
		 
		 ps.executeQuery();
		 
		 
		 ps1.setString(1,username);
		 ps1.setString(2,registration_no);
		 ps1.setString(3,ccode);
		 ps1.setString(4,school);
		 ps1.setString(5,yearofjoining);
		 
		 ps1.executeQuery();
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public void addteacher() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="insert into logincheck values(?,?)";
		 String s4="insert into user_profile values(?,?,?,?,?,?,?,?,?,?,?,?)";
		 String s5="insert into teacher_profile values(?,?,?,?,?,?)";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,username);
		 psi.setString(2,password);
		 
		 psi.executeQuery();
		 
		 
		 
		 ps.setString(1,username);
		 ps.setString(2,type);
		 ps.setString(3,dcode);
		 ps.setString(4,name);
		 ps.setString(5,email);
		 ps.setString(6,gender);
		 ps.setString(7,address);
		 ps.setString(8,phone);
		 ps.setString(9,dateofbirth);
		 ps.setString(10,hobbies);
		 ps.setString(11,status);
		 ps.setString(12,"professor.gif");
		 
		 
		 ps.executeQuery();
		 
		 
		 ps1.setString(1,username);
		 ps1.setString(2,teacher_no);
		 ps1.setString(3,office);
		 ps1.setString(4,graduation);
		 ps1.setString(5,postgraduation);
		 ps1.setString(6,dateofjoining);
		 
		 ps1.executeQuery();
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public ArrayList showdcode() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from dept_master";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 

		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			bean d=new bean();
			d.dcode=rs.getString("dcode");
			d.dname=rs.getString("dname");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public ArrayList showccode() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from course_master";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 

		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			bean d=new bean();
			d.ccode=rs.getString("ccode");
			d.cname=rs.getString("cname");
			a1.add(d);
		}
		
		con.close();	 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}


public void  delete() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="delete from logincheck where username=(?)";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		ps.setString(1,username);
		ps.executeQuery(); 
		
		 
		con.close();	 	
	
	 }catch(SQLException e){throw new ServletException(e);}
}


public void img() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		
		 String s3="select image from user_profile where username=(?)";
		 
		 PreparedStatement ps=con.prepareStatement(s3);
		 ps.setString(1,username);
		 ResultSet rs=ps.executeQuery();
		 if(rs.next())
		 {
			 image=rs.getString("image");
			 System.out.print(image);
		 }
		 
		
		 
		 
		 
		 con.close(); 
	}catch(SQLException e){throw new ServletException(e);}

}
public void demodstu() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username=(?)";
		 String s4="select * from user_profile where username=(?)";
		 String s5="select * from student_profile where username=(?)";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,username);
		 ps.setString(1,username);
		 ps1.setString(1,username);
		 
		 ResultSet rs=psi.executeQuery();
		 
		 ResultSet rs1=ps.executeQuery();
		
		 ResultSet rs2=ps1.executeQuery();
		
		 if(rs.next())
		 {
			 password=rs.getString("password");
		 }
		 
		 if(rs1.next())
		 {
			 dcode=rs1.getString("dcode");
			 name=rs1.getString("name");
			 email=rs1.getString("email");
			 gender=rs1.getString("gender");
			 address=rs1.getString("address");
			 phone=rs1.getString("phone");
			 dateofbirth=rs1.getString("dateofbirth");
			 hobbies=rs1.getString("hobbies");
			 status=rs1.getString("status");
		 
		 }
		 if(rs2.next())
		 {
			 registration_no=rs2.getString("registration_no");
			 ccode=rs2.getString("ccode");
			 school=rs2.getString("school");
			 yearofjoining=rs2.getString("yearofjoining");
			 		
		 }
		 
		 
		 
		 con.close();	 
		 
	}catch(SQLException e){throw new ServletException(e);}

}
public void modifystudent() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="update logincheck set password=? where username=?";
		 String s4="update user_profile set dcode=?,dateofbirth=?,status=? where username=?";
		 String s5="update student_profile set registration_no=?,ccode=?,yearofjoining=? where username=?";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,password);
		 psi.setString(2,username);
		 
		 psi.executeQuery();
		 
		 
		 
		 ps.setString(4,username);
		
		 ps.setString(1,dcode);
		 ps.setString(2,dateofbirth);
		 ps.setString(3,status);
		 
		 
		 ps.executeQuery();
		 
		 
		 ps1.setString(4,username);
		 ps1.setString(1,registration_no);
		 ps1.setString(2,ccode);
		 ps1.setString(3,yearofjoining);
		 
		 ps1.executeQuery();
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public void demodteach() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username=(?)";
		 String s4="select * from user_profile where username=(?)";
		 String s5="select * from teacher_profile where username=(?)";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,username);
		 ps.setString(1,username);
		 ps1.setString(1,username);
		 
		 ResultSet rs=psi.executeQuery();
		 
		 ResultSet rs1=ps.executeQuery();
		
		 ResultSet rs2=ps1.executeQuery();
		
		 if(rs.next())
		 {
			 password=rs.getString("password");
		 }
		 
		 if(rs1.next())
		 {
			 dcode=rs1.getString("dcode");
			 name=rs1.getString("name");
			 email=rs1.getString("email");
			 gender=rs1.getString("gender");
			 address=rs1.getString("address");
			 phone=rs1.getString("phone");
			 dateofbirth=rs1.getString("dateofbirth");
			 hobbies=rs1.getString("hobbies");
			 status=rs1.getString("status");
		 
		 }
		 if(rs2.next())
		 {
			 teacher_no=rs2.getString("teacher_no");
			 office=rs2.getString("office");
			 graduation=rs2.getString("graduation");
			 postgraduation=rs2.getString("postgraduation");
			 dateofjoining=rs2.getString("dateofjoining");
			 		
		 }
		 
		 
		 
		 con.close();	 
		 
	}catch(SQLException e){throw new ServletException(e);}

}
public void modifyteacher() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="update logincheck set password=? where username=?";
		 String s4="update user_profile set dcode=?,dateofbirth=?,status=? where username=?";
		 String s5="update teacher_profile set teacher_no=?,office=?,dateofjoining=? where username=?";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,password);
		 psi.setString(2,username);
		 
		 psi.executeQuery();
		 
		 
		 
		 ps.setString(4,username);
		
		 ps.setString(1,dcode);
		 ps.setString(2,dateofbirth);
		 ps.setString(3,status);
		 
		 
		 ps.executeQuery();
		 
		 
		 ps1.setString(4,username);
		 ps1.setString(1,teacher_no);
		 ps1.setString(2,office);
		 ps1.setString(3,dateofjoining);
		 
		 ps1.executeQuery();
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public void stuedit_prof() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="update user_profile set name=?,email=?,gender=?,address=?,phone=?,hobbies=? where username=?";
		 String s5="update student_profile set school=? where username=?";
		 
		
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 
		 
		 
		 ps.setString(7,username);
		 ps.setString(1,name);
		 ps.setString(2,email);
		 ps.setString(3,gender);
		 ps.setString(4,address);
		 ps.setString(5,phone);
		 ps.setString(6,hobbies);
		 
		 
		 
		 ps.executeQuery();
		 
		 
		 ps1.setString(2,username);
	
		 ps1.setString(1,school);
		 
		 
		 ps1.executeQuery();
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}

public void teacheredit_prof() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="update user_profile set name=?,email=?,gender=?,address=?,phone=?,hobbies=? where username=?";
		 String s5="update teacher_profile set graduation=?,postgraduation=?,office=? where username=?";
		 
		
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 
		 
		 
		 ps.setString(7,username);
		 ps.setString(1,name);
		 ps.setString(2,email);
		 ps.setString(3,gender);
		 ps.setString(4,address);
		 ps.setString(5,phone);
		 ps.setString(6,hobbies);
		 
		 
		 
		 ps.executeQuery();
		 
		 
		 ps1.setString(4,username);
	
		
		 ps1.setString(1,graduation);
		 ps1.setString(2,postgraduation);
		 ps1.setString(3,office);
		 ps1.executeQuery();
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}

public void createalbum() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into album values(?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		  ps.setString(2,albumname);
		 ps.setString(3,description);
		 ps.setString(4,username);
			
		 ps.executeQuery();
		 
		 
		 con.close();	

	}catch(SQLException e){throw new ServletException(e);}

}
public boolean album_namecheck() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from album where username=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,username);

		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			if(rs.getString("albumname").equalsIgnoreCase(albumname))
				p=true;
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return p;
}

public ArrayList show_albums() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from album where username=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		 ps.setString(1,username);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			d.albumid=rs.getInt("albumid");
			d.albumname=rs.getString("albumname");
			
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public ArrayList search_name() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username like ?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		 ps.setString(1,search_string+"%");
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			d.username=rs.getString("username");
			
			a1.add(d);
		}
		
		con.close();	 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public ArrayList show_photos() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from photos where albumid=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		 ps.setInt(1,albumid);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			d.photoid=rs.getInt("photoid");
			d.photoname=rs.getString("photoname");
			d.phototitle=rs.getString("phototitle");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public void add_photo() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into photos values(?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		  ps.setInt(2,albumid);
		 ps.setString(3,phototitle);
		 ps.setString(4,photoname);
			
		 ps.executeQuery();
		 
		 
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public ArrayList show_students() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from student_profile";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
	
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			d.username=rs.getString("username");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public ArrayList show_teachers() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from teacher_profile";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
	
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			d.username=rs.getString("username");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}

public void sendmsg() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="insert into messages values(?,?,?,?,?,?)";
		 
		
		 PreparedStatement ps=con.prepareStatement(s3);

		 

		 
		 
		 ps.setInt(1,7);
		 ps.setString(2,sentto);
		 ps.setString(3,frm);
		 ps.setString(4,message);
		 ps.setString(5,time);
		 ps.setString(6,dat);
		
		 ps.executeQuery();
		 
	
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public ArrayList show_msg() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from messages where sentto=? order by dat";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,sentto);
	
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			d.frm=rs.getString("frm");
			d.message=rs.getString("message");
			d.time=rs.getString("time");
			d.dat=rs.getString("dat");
			d.msgid=rs.getString("msgid");
			a1.add(d);
		}
		
		con.close();	 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}




public void profile_others2() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username=(?)";
		 String s4="select * from user_profile where username=(?)";
		 String s5="select * from student_profile where username=(?)";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,username);
		 ps.setString(1,username);
		 ps1.setString(1,username);
		 
		 ResultSet rs=psi.executeQuery();
		 
		 ResultSet rs1=ps.executeQuery();
		
		 ResultSet rs2=ps1.executeQuery();
		
		 if(rs.next())
		 {
			 password=rs.getString("password");
		 }
		 
		 if(rs1.next())
		 {
			 dcode=rs1.getString("dcode");
			 name=rs1.getString("name");
			 email=rs1.getString("email");
			 gender=rs1.getString("gender");
			 address=rs1.getString("address");
			 phone=rs1.getString("phone");
			 dateofbirth=rs1.getString("dateofbirth");
			 hobbies=rs1.getString("hobbies");
			 status=rs1.getString("status");
		 
		 }
		 if(rs2.next())
		 {
			 registration_no=rs2.getString("registration_no");
			 ccode=rs2.getString("ccode");
			 school=rs2.getString("school");
			 yearofjoining=rs2.getString("yearofjoining");
			 		
		 }
		 
		 
		 
		 
		 con.close();	 
	}catch(SQLException e){throw new ServletException(e);}

}

public void profile_others1() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username=(?)";
		 String s4="select * from user_profile where username=(?)";
		 String s5="select * from teacher_profile where username=(?)";
		 
		 PreparedStatement psi=con.prepareStatement(s3);
		 PreparedStatement ps=con.prepareStatement(s4);
		 PreparedStatement ps1=con.prepareStatement(s5);
		 
		 
		 psi.setString(1,username);
		 ps.setString(1,username);
		 ps1.setString(1,username);
		 
		 ResultSet rs=psi.executeQuery();
		 
		 ResultSet rs1=ps.executeQuery();
		
		 ResultSet rs2=ps1.executeQuery();
		
		 if(rs.next())
		 {
			 password=rs.getString("password");
		 }
		 
		 if(rs1.next())
		 {
			 dcode=rs1.getString("dcode");
			 name=rs1.getString("name");
			 email=rs1.getString("email");
			 gender=rs1.getString("gender");
			 address=rs1.getString("address");
			 phone=rs1.getString("phone");
			 dateofbirth=rs1.getString("dateofbirth");
			 hobbies=rs1.getString("hobbies");
			 status=rs1.getString("status");
		 
		 }
		 if(rs2.next())
		 {
			 teacher_no=rs2.getString("teacher_no");
			 office=rs2.getString("office");
			 graduation=rs2.getString("graduation");
			 postgraduation=rs2.getString("postgraduation");
			 dateofjoining=rs2.getString("dateofjoining");
			 		
		 }
		 
		 
		 
		 con.close();	 
		 
	}catch(SQLException e){throw new ServletException(e);}

}
public void show_msg1() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from messages where msgid=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,msgid);
	
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			frm=rs.getString("frm");
			message=rs.getString("message");
			time=rs.getString("time");
			dat=rs.getString("dat");
			
		}
		
		con.close();	 
	 }catch(SQLException e){throw new ServletException(e);}

	 
}
public void creategroup() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into groups values(?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		 ps.setString(2,groupname);
		 ps.setString(3,groupabout);
		 ps.setString(4,username);
			
		 ps.executeQuery();
		 
		 
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public boolean groupcheck() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from groups where groupowner=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,username);

		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			if(rs.getString("groupname").equalsIgnoreCase(groupname))
				p=true;
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return p;
}
public ArrayList showgroups() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from groups";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			d.groupid=rs.getInt("groupid");
			d.groupname=rs.getString("groupname");
			d.groupabout=rs.getString("groupabout");
			d.groupowner=rs.getString("groupowner");
			a1.add(d);
		}
		
		con.close();	 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}

public ArrayList showtopics() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from grouptopics where groupid=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setInt(1,groupid);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			d.topicid=rs.getInt("topicid");
			d.topicname=rs.getString("topicname");
			d.dat=rs.getString("dat");
			d.time=rs.getString("time");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public ArrayList stushowtopics() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from grouptopics where creator=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setString(1,creator);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			d.topicid=rs.getInt("topicid");
			d.topicname=rs.getString("topicname");
			d.dat=rs.getString("dat");
			d.time=rs.getString("time");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public void addtopic() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into grouptopics values(?,?,?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,groupid);
		  ps.setInt(2,7);
		 ps.setString(3,topicname);
		 ps.setString(4,dat);
		 ps.setString(5,time);
		 ps.setString(6,username);
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}

public void deletetopic() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="delete from grouptopics where topicid=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 ps.setInt(1,topicid);
		  
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public void deletemsg() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="delete from messages where msgid=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 ps.setString(1,msgid);
		  
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public ArrayList showcomments() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from topiccomments where topicid=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setInt(1,topicid);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			d.commentor=rs.getString("commentor");
			d.tmsgid=rs.getInt("tmsgid");
			d.tcomment=rs.getString("tcomment");
			d.dat=rs.getString("dat");
			d.replyid=rs.getInt("replyid");
			d.time=rs.getString("time");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}

public void addcomment() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into topiccomments values(?,?,?,?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 ps.setInt(1,7);
		 ps.setInt(2,topicid);
		 ps.setString(3,commentor);
		 ps.setString(4,tcomment);
		 ps.setString(5,dat);
		 ps.setInt(6,replyid);
		 ps.setString(7,time);
			
		 ps.executeQuery();
		 
		 
		
		 con.close();
	}catch(SQLException e){throw new ServletException(e);}

}
public void showreplies() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from topiccomments where tmsgid=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setInt(1,tmsgid);
		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			
			
			commentor=rs.getString("commentor");
			tmsgid=rs.getInt("tmsgid");
			tcomment=rs.getString("tcomment");
			dat=rs.getString("dat");
			replyid=rs.getInt("replyid");
			time=rs.getString("time");
			
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	
}

public void showreplies_nc(Connection con) throws ServletException
{
	try
	{
		 String s3="select * from topiccomments where tmsgid=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setInt(1,tmsgid);
		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			
			
			commentor=rs.getString("commentor");
			tmsgid=rs.getInt("tmsgid");
			tcomment=rs.getString("tcomment");
			dat=rs.getString("dat");
			replyid=rs.getInt("replyid");
			time=rs.getString("time");
			
		}
		
	 }catch(SQLException e){throw new ServletException(e);}

	
}


public ArrayList showreplies1() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from topiccomments where replyid=? order by tmsgid desc ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		ps.setInt(1,replyid);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			d.commentor=rs.getString("commentor");
			d.tmsgid=rs.getInt("tmsgid");
			d.tcomment=rs.getString("tcomment");
			d.dat=rs.getString("dat");
			d.replyid=rs.getInt("replyid");
			d.time=rs.getString("time");
			a1.add(d);
		}
		
		con.close();
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public String cimage() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select image from user_profile where username=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setString(1,imgusername);
		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			
			
			cimage=rs.getString("image");
			
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

return cimage;
	
}
public String adminimage() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select image from admin";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			
			
			cimage=rs.getString("image");
			
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

return cimage;
	
}
public String cimage1(Connection con) throws ServletException
{
	try
	{
		 String s3="select image from user_profile where username=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setString(1,imgusername);
		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			
			
			cimage=rs.getString("image");
			
		}
		
		
	 }catch(SQLException e){throw new ServletException(e);}

return cimage;
	
}


public void deletegroup() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="delete from groups where groupid=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 ps.setInt(1,groupid);
		  
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public int numofreplies() throws ServletException
{ 
	
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from topiccomments where replyid=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setInt(1,replyid);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			i++;
			
			
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	return i;
}


	
public int numofreplies1(Connection con) throws ServletException
{ 
	
	try
	{
		 
	
		 String s3="select * from topiccomments where replyid=? ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setInt(1,replyid);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			i++;
			
			
		}
		
	 }catch(SQLException e){throw new ServletException(e);}

	return i;
}

public void changepic() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="update user_profile set image=? where username=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 ps.setString(1,image);
		 ps.setString(2,username);
		
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}

public void savenews() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into news values(?,?,?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		  ps.setString(2,newstitle);
		 ps.setString(3,newsinfo);
		 ps.setString(4,dat);
		 ps.setString(5,time);
		 ps.setString(6,newsowner);
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}

public ArrayList shownews() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from news order by newsid desc";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			//d.newsid=rs.getInt("newsid");
			d.newstitle=rs.getString("newstitle");
			d.newsinfo=rs.getString("newsinfo");
			d.dat=rs.getString("dat");
			d.time=rs.getString("time");
			d.newsowner=rs.getString("newsowner");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public void saveattachment() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into attachments values(?,?,?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		  ps.setString(2,atowner);
		 ps.setString(3,attachment);
		 ps.setString(4,time);
		 ps.setString(5,dat);
		 ps.setString(6,title);
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public ArrayList showattachments() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from attachments order by aid desc";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			//d.newsid=rs.getInt("newsid");
			d.atowner=rs.getString("atowner");
			d.attachment=rs.getString("attachment");
			d.dat=rs.getString("dat");
			d.time=rs.getString("time");
			d.title=rs.getString("title");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public ArrayList showvideos() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from videos order by vid desc";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			//d.newsid=rs.getInt("newsid");
			d.videoowner=rs.getString("owner");
			d.video=rs.getString("video");
			d.dat=rs.getString("dat");
			d.time=rs.getString("time");
			d.title=rs.getString("title");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public void savevideos() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into videos values(?,?,?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		  ps.setString(2,videoowner);
		 ps.setString(3,video);
		 ps.setString(4,time);
		 ps.setString(5,dat);
		 ps.setString(6,title);
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public void deletevideo() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="delete from videos where video=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	
		  ps.setString(1,video);
		  ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public void startchat() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into chat values(?,?,?,?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		  ps.setString(2,user1);
		 ps.setString(3,user2);
		 ps.setString(4,time);
		 ps.setInt(5,chatstatus);
			
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public void leftchat() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="update chat set chatstatus=3 where chatid=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 ps.setInt(1,chatid);
			System.out.print(chatid);
		 ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public void takechatid() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		
		 String s4="select * from chat where user1=? and user2=? and chatstatus=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		 ps.setString(1,user1);
		  ps.setString(2,user2);
		  ps.setInt(3,1);
			
		 ResultSet rs=ps.executeQuery();
		 if(rs.next())
		 {
			 chatid=rs.getInt("chatid");
			 chatstatus=rs.getInt("chatstatus");
		 }
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public void passcheck() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from logincheck where username=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,username);

		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			password=rs.getString("password");
	
		}
		
			
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 
}
public void changepass() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="update logincheck set password=? where username=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 ps.setString(1,password);
		 ps.setString(2,username);
		 ps.executeQuery();
		
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 
}
public void addonline() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="insert into onlinepersons values(?,?)";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	ps.setInt(1,7);
		  ps.setString(2,username);
		  ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public void deleteonline() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 
		 String s4="delete from onlinepersons where username=?";
		 
		 PreparedStatement ps=con.prepareStatement(s4);
		
		 	
		  ps.setString(1,username);
		  ps.executeQuery();
		 
		 
		 con.close();

	}catch(SQLException e){throw new ServletException(e);}

}
public ArrayList show_online() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from onlinepersons order by username ";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			d.onlineid=rs.getInt("onlineid");
			d.username=rs.getString("username");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public ArrayList showchat() throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="select * from chat where chatstatus=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setString(1,"1");
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			
			bean d=new bean();
			
			d.chatid=rs.getInt("chatid");
			d.user1=rs.getString("user1");
			d.user2=rs.getString("user2");
			d.time=rs.getString("time");
			a1.add(d);
		}
		
		con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	 return a1;
}

public void revolve(String chatuser,String chatid) throws ServletException
{
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 
		 String s2="jdbc:oracle:thin:@localhost:1521:";
		 Connection con=DriverManager.getConnection(s2,"project","study");
		 String s3="update chat set chatstatus=2 where user2=? and chatid=?";
		 PreparedStatement ps=con.prepareStatement(s3);
		 
		 
		ps.setString(1,chatuser);
		ps.setString(2,chatid);
		
		ps.executeQuery();
				con.close(); 
	 }catch(SQLException e){throw new ServletException(e);}

	
}



}
