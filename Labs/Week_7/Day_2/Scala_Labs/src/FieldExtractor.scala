object FieldExtractor extends App {

  def breaker(str:String):Unit = {
    val pattern = raw"(.*):(.*):(.*):(.*):(.*):(.*):(.*)".r
    val  pattern (username,password,userid,groupid,description,home_directory,shell) = str
    println(s"username -> ${username}\n password -> ${password}\n userid -> ${userid} \n groupid -> ${groupid}\n description -> ${description}\n home_directory -> ${home_directory}\n shell -> ${shell} ")
    println()

  }
  var files = "root:\u200Bx:0:0:root:/root:/bin/bash" +
    "\nbin:\u200Bx:1:1:bin:/bin:/sbin/nologin" +
    "\ndaemon:\u200Bx:2:2:daemon:/sbin:/sbin/nologin" +
    "\nadm:\u200Bx:3:4:adm:/var/adm:/sbin/nologin" +
    "\nlp:\u200Bx:4:7:lp:/var/spool/lpd:/sbin/nologin" +
    "\nsync:\u200Bx:5:0:sync:/sbin:/bin/sync\n"
  files split("\n") foreach(x => breaker(x))


}
