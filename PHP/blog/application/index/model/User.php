<?php

namespace app\index\model;

use think\Model;

class User extends Model
{
    protected $pk = 'id';
    protected $table = 'users';
    protected $autoCheckFields = true;
}
