package com.kodilla.stream.immutable;

public final class ForumUser {

   private final String username;
   private  final String realName;

   public String getUsername() {
      return username;
   }

   public String getRealName() {
      return realName;
   }

   public ForumUser(String username, String realName) {
      this.username = username;
      this.realName = realName;
   }
}
