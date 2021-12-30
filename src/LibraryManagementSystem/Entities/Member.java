package LibraryManagementSystem.Entities;

import LibraryManagementSystem.Service.SearchService;

public class Member {
  private Profile profile;

  public Member(String name) {
  }

  public Member(Profile profile) {
    this.profile = profile;
  }
}
